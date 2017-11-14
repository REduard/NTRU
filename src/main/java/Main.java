import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import userInterface.Menu;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Component
public class Main {
    @Autowired
    private Menu menu;

    public static void main(String[] args) {
        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/spring.xml");
        Main main= (Main) ctx.getBean("main");
        main.display();
    }
    private void display(){
        menu.option1();
    }
}
