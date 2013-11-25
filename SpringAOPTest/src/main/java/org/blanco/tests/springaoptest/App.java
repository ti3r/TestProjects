package org.blanco.tests.springaoptest;

import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    
    static Logger logger = Logger.getGlobal();
    
    public static void main( String[] args )
    {
	logger.info("Stating application context");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
	
	SimpleAspect aspect  = ctx.getBean(SimpleAspect.class);
	aspect.sayHi();
	aspect.transaction3Steps();
    }
}
