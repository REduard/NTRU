package auxiliary;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by R.Eduard on 14.11.2017.
 */
@Aspect
public class LoggingAspect {
    @Before("execution(public void option1())")
    public void LoggingAdvice(){
        System.out.println("Method started");
    }
}
