package userInterface;

import auxiliary.ConnectionNode;
import communication.ConnectionManager;
import communication.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Component("menu")
public class Menu {

    @Autowired
    private Messenger messenger;

    public Menu() {

    }

    public void start() {
        mainMenu();
        Integer option = getOption();
        ConnectionNode connectionNode = null;
        switch (option) {
            case 1:
                connectionNode = connectMenu();
                break;
            case 2:
                connectionNode = listenMenu();
                break;
            case 3:
                System.exit(-1);
            default:
                break;
        }

        switch (option) {
            case 1:
//                connnectionManager.openConnection(connectionNode);
                messageMenu();
                break;
            case 2:

                break;
            case 3:
                System.exit(-1);
            default:
                break;
        }
    }

    private void messageMenu() {
        System.out.println("Write message");
        try (Scanner s = new Scanner(System.in)) {
            String message=s.nextLine();
            messenger.sendMessage(message);
        }
    }

    private void mainMenu() {
        System.out.println("1: Connect");
        System.out.println("2: Listen for connection");
        System.out.println("3: Exit");
    }

    private ConnectionNode connectMenu() {
        ConnectionNode connectionNode = new ConnectionNode();

        System.out.println("Please insert the IP Address and Port to connect to:");
        try (Scanner s = new Scanner(System.in)) {
            connectionNode.setIpAddress(s.nextLine());
            connectionNode.setPort(s.nextInt());
        }
        return connectionNode;
    }

    private ConnectionNode listenMenu() {
        ConnectionNode connectionNode = new ConnectionNode();
        System.out.println("Please insert the IP Address and Port to listen to:");
        try (Scanner s = new Scanner(System.in)) {
            connectionNode.setIpAddress(s.nextLine());
            connectionNode.setPort(s.nextInt());
        }
        return connectionNode;
    }

    private Integer getOption() {
        Integer option;
        try (Scanner s = new Scanner(System.in)) {
            option = s.nextInt();
        }
        return option;
    }
}
