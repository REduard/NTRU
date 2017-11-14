package userInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Component("menu")
public class Menu {

//    @Autowired
//    private ConnectionManager connnectionManager;

    public Menu(){

    }

    public void option1(){
        System.out.println("Please set the IP Address");
        System.out.println("---------------------");

    }
}
