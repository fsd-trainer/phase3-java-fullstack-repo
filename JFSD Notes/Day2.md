Agenda:
   - Spring architecture - completed
   - Dependency Injection and IOC - partial completed
   - spring benefits - completed
   - Develop spring core application - In-progress
   - Spring MVC - in the next session
   - Develop spring web application for student system - next session

   =======================================================================

Latest version of Spring Framework is 6.0.7
=====================================================================
   Java Frameworks
=======================================================================
     Java Enterprise Edition - Servlet & JSP (Web applciation)
                             - EJB (Enterprise Java Beans) - Building the enterprise level application.
                             Disadvantage - Application becomes complex with lot of configurations

    spring framework is successor to EJB framework.
    With spring, it is easy to develop business application with configurations.

    struts - Web applications
    Hibernate - database
    JSF (Java team) - Web applications
    ================================================================

   Spring Framework - Spring Core 

Features 
   1. Spring framework can integarte with other framework and APIs (hibernate, JDBC, kafka, batch.., web)  - called as framework of frameworks

   Integrate to frameworks - Configurations

  2. Lightweight - spring container is not installable item. Spring container implementation is given as API

  
  Job of Spring container = Instantiate Objects, manage life cycle of objects, dependencies of objects


  1.   BeanFactory (I) -> instantiate or create spring container
      |
     ==========================
     |          |            |
     
     XMLBeanFactory (XML based)


Spring 1/2/2.3 version - configuration were written only in XML
Spring 2.5+ version - configuration was also written in annotation form

2. Another implementation which is advanced than BeanFactory - ApplicationContext Interface


BeanFactory (I) - understands only xml configuration
  |
ApplicationContext (I) - understand XML as well as annotations  
  |
    ClassPathXMLAnnotationContext (C) - understand xml
    WebXmlApplicationContext(c) - XML-based 
    AnnotationConfigApplicationContext(c) - Annotation-based

Core Job of spring container -  Instantiate & Initializing Objects, manage life cycle of objects, dependencies of objects

Implementation:

To create spring container to manage objects and their dependencies.

step1 : Write a Java class with properties and methods - completed
step2 : Write the xml configuration file to register objects - completed
step3: application that will instantiate spring container and register class object in it. - completed
step4 : Once the bean  is created in the container, application needs to get the bean (s) from the container

After the object are created in the spring container, they are initialized

sequence of calling the method to initialize the properties are:
a. Constructor called
b. setter called


Spring container also manages dependencies of the objects.
HOW and WHAT is it?
Spring container is implementing a design pattern called as DEPENDENCY INJECTION

DEPENDENCY INJECTION - is  a technique where the required object will be injected with the dependent object by the spring container.

Example: Suppose a Car object has dependencies on other objects like Engine and Insurance.

class Car{

    int carid
    string make
    string color
    Engine engine // dependent object
    Insurance insurance // dependent object

}

class Engine{
  
    engineid;
    vendor

}

class Insurance{

} 

* The concept of injecting dependent objects is called wiring.

Configuration of DI ....































API - APplication Programming Interface
      JAva APIs
             package
                  class
                  interface


















