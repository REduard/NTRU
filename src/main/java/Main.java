import ntru.CryptoSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Component
public class Main {
    @Autowired
    @Qualifier("ntruCryptosystem")
    private CryptoSystem ntruCryptosystem;

    public static void main(String[] args) {
        ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/spring.xml");
        Main main= (Main) ctx.getBean("main");
        main.testLogging();
    }
    private void testLogging(){
        ntruCryptosystem.encrypt("plaintext");
        ntruCryptosystem.decrypt("encrypted text", "v$N4oQF6VH");
    }
}
