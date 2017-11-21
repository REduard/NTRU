package userInterface;

import auxiliary.ConnectionNode;
import communication.ConnectionManager;
import ntru.CryptoSystem;
import ntru.Polynomial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Component
public class Demo {
    @Autowired
    @Qualifier("ntruCryptosystem")
    private CryptoSystem ntruCryptosystem;
    @Autowired
    private Polynomial polynomial;
    @Autowired
    private Menu menu;
    @Autowired
    private ConnectionManager connnectionManager;

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/spring.xml");
        Demo demo = (Demo) ctx.getBean("demo");
//        main.menu.start();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String msg= scanner.nextLine();
                demo.connnectionManager.sendMessage(msg);
            }
        }
    }

}
