package communication;

import auxiliary.ConnectionNode;
import org.springframework.stereotype.Component;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by R.Eduard on 31.10.2017.
 */
@Component("connectionManager")
public class ConnectionManager {
    private ConnectionNode connectionNodeSender;
    private ConnectionNode connectionNodeReceiver;
    private Thread listenThread;
    private Socket client;

    public void openConnection(ConnectionNode connectionNodeSender, ConnectionNode connectionNodeReceiver) {
        this.connectionNodeSender = connectionNodeSender;
        this.connectionNodeReceiver = connectionNodeReceiver;

        listenThread = new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(connectionNodeSender.getPort())) {
                System.out.println("Waiting for client on port " +
                        serverSocket.getLocalPort() + "...");

                    Socket server = serverSocket.accept();

                    System.out.println("Just connected to " + server.getRemoteSocketAddress());
                    DataInputStream in = new DataInputStream(server.getInputStream());
                    while (true) {
                    System.out.println(in.readUTF());

//                    DataOutputStream out = new DataOutputStream(server.getOutputStream());
//                    out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
//                            + "\nGoodbye!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        listenThread.start();
    }

    public void sendMessage(String message) {
        DataOutputStream out = null;

        if (client != null) {

            try {
                out = new DataOutputStream(client.getOutputStream());
                out.writeUTF(message);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                this.client = new Socket(connectionNodeReceiver.getIpAddress(), connectionNodeReceiver.getPort());
                out = new DataOutputStream(client.getOutputStream());
                out.writeUTF(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void closeConnection() {
        listenThread.interrupt();
    }

//    public Connection getConnection() {
//        return connection;
//    }
}
