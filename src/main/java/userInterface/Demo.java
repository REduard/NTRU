package userInterface;

import auxiliary.ConnectionNode;
import communication.ConnectionManager;
import communication.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Component
public class Demo {
//    @Autowired
//    private final Messenger messenger;
    private final ConnectionManager connectionManager;

    @Autowired
    public Demo(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }
//    @Autowired
//    public Demo(Messenger messenger) {
//        this.messenger = messenger;
//    }

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/spring.xml");
        Demo demo = (Demo) ctx.getBean("demo");

        demo.connectionManager.openConnection(new ConnectionNode("localhost", 64713), new ConnectionNode("localhost", 64714),"0NSrV9Xa0bD4BVJZ");
//        demo.connectionManager.openConnection(new ConnectionNode("localhost", 64714), new ConnectionNode("localhost", 64713));


        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String msg = scanner.nextLine();
                if (msg.equalsIgnoreCase("~")) {
                    break;
                }
                demo.connectionManager.sendMessage(msg);
            }
        }

        demo.connectionManager.closeConnection();
    }

}
