package auxiliary;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Aspect
public class LoggingAspect {

    @Before("execution(public String encrypt(..))")
    public void LoggingAdviceBeforeEncryption(){
        System.out.println("INFO: Encrypting message...");
        System.out.println();
    }
    @After("execution(public String encrypt (..))")
    public void LoggingAdviceAfterEncryption(){
        System.out.println();
        System.out.println("INFO: Encrypting complete.");
    }

    @Before("execution(public String decrypt(..))")
    public void LoggingAdviceBeforeDecryption(){
        System.out.println("INFO: Decrypting message...");
        System.out.println();
    }
    @After("execution( public String decrypt(..))")
    public void LoggingAdviceAfterDecryption(){
        System.out.println();
        System.out.println("INFO: Decryption complete.");
    }
    @After("execution( public void MultiplyPolynomial (..))")
    public void LoggingAdviceBeforeMultiplyPolynomial(){
        System.out.println();
        System.out.println("INFO: Calling multiply operation...");
    }
    @After("execution( public void MultiplyPolynomial(..))")
    public void LoggingAdviceAfterMultiplyPolynomial(){
        System.out.println();
        System.out.println("INFO: Multiply operation done.");
    }
}
