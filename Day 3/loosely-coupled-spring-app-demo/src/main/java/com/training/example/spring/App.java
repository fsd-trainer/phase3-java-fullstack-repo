package com.training.example.spring;

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
        
        // Create the spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
        
        System.out.println("Container created and beans instantiated and wired");
        
        System.out.println("==============================================");
        
          Person personObject =   context.getBean(Person.class); 
          
          System.out.println(personObject.getPersonId());
          System.out.println(personObject.getPersonName());
          System.out.println(personObject.getAddress().getCity());
          System.out.println(personObject.getAddress().getPostalCode());
    }
}
