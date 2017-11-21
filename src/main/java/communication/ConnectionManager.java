package communication;

import auxiliary.ConnectionNode;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by R.Eduard on 31.10.2017.
 */
@Component("connectionManager")
@Scope("prototype")
public class ConnectionManager {
    private ConnectionNode connectionNodeReceiver;
    private Thread listenThread;
    private Socket client;
    private String publicKey;
    private String receiverPublicKey;

    public ConnectionManager() {
    }

    public void openConnection(ConnectionNode connectionNodeSender, ConnectionNode connectionNodeReceiver, String publicKey) {
        this.connectionNodeReceiver = connectionNodeReceiver;
        this.publicKey = publicKey;

        listenThread = new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(connectionNodeSender.getPort())) {
                System.out.println("Waiting for client on port " +
                        serverSocket.getLocalPort() + "...");

                Socket server = serverSocket.accept();

                DataInputStream in = new DataInputStream(server.getInputStream());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF(publicKey);
                while (true) {
                    //read
                    System.out.println(in.readUTF());
                    out.writeUTF("Message received");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        listenThread.start();
    }

    public void sendMessage(String message) {
        DataOutputStream out;
        DataInputStream in;
        if (client != null) {

            try {
                out = new DataOutputStream(client.getOutputStream());
                out.writeUTF(message);
                in = new DataInputStream(client.getInputStream());
                System.out.println(in.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            try {
                this.client = new Socket(connectionNodeReceiver.getIpAddress(), connectionNodeReceiver.getPort());
                out = new DataOutputStream(client.getOutputStream());
                out.writeUTF(message);
                in = new DataInputStream(client.getInputStream());
                System.out.println(in.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String retrievePublicKey() {
        DataOutputStream out;
        DataInputStream in;
        try {
            this.client = new Socket(connectionNodeReceiver.getIpAddress(), connectionNodeReceiver.getPort());
            in = new DataInputStream(client.getInputStream());
            return in.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection() {
        listenThread.interrupt();
    }

}
