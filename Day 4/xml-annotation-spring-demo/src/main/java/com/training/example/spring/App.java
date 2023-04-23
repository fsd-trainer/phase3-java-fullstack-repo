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
        // create the container
        ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");
        
        System.out.println("container started and bean registered in it");
        
        System.out.println("=================================================");
        // Ask for the bean from the container
        
       Person personObject = (Person) container.getBean("person");
       System.out.println(personObject.toString());
       
      Address addressObject =   (Address) container.getBean("addressBean");
      System.out.println(addressObject);  // addressObject.toString
           
       
       
       
    }
}
