package com.test.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Restaurant rObject= (Restaurant)context.getBean("restaurantBean");
    	rObject.greetCustomer();
        System.out.println( "Hello World!" );
    }
}
