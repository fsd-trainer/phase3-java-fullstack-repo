Last Sessions completed - Spring WEb MVC , Spring JDBC app, Spring core (@Component, Autowired), Spring with XML configuration

Did you develop the application?????

During the week, if any errors in applictions or doubts - write to Learner success manager, she will forward mails to me for reply.

or

I join around 6:30pm for the session, you can connect 30 mins prior to the session to solve your doubts.

Will at stop 10:45 pm for the doubts. 

===================================================================
Quiz
==========================================================

1. Which is the default servlet in Spring Web MVC?
 
       DispatcherServlet ------------------> Controller (s)

2.   Which view technology is used to present UI to the client?
          
            JSP (Java Server Page) as View to present UI to the client

3. Who is the client for Web application running on server?

   Web Browserr render Web pages  

* Web Pages are developed for Humans to see and interact with UI
Example: flipkart, amazon, makemytrip
        
        Application Level protocol (HTTP)

4. Web Browser ---------------> Spring Web Application on server 
              <--------------

Applications available on the Web (internet)
Applications         |           protocol
==========================================================
Web application      | HTTP / HTTPs (Security Certificate)
Email app            | SMTP 
File Server          | FTP (File Transfer Protocol)

=============================================================
Agenda :  To create REST APIs in Spring Web application using Spring Boot 

Spring Boot , REST API / REST (Two new things)


* What is Spring Boot?
  Spring Boot is a project that speeds the spring application
  development

Features of Spring Boot
======================================
1. Spring Boot identifies the dependencies with the right
   version to be added in the spring project

   Example: I selected Spring Boot 2.7.11 version
   2.7.11 version will decided
          - spring dependencies (Core, JPA, JDBC) versions
          - External dependencies (kafka, jpa, hibernate) versions
            compatible to spring

2. Spring Boot provides web application named
    Spring Initialzr used to generating Maven project


3. Spring Boot provides Tomcat server as part of application.

4. Spring Boot application instantiate (create) spring container
   and configure default beans in it at runtime

5. Spring Boot auto configure beans and configuration for 
    selected dependencies              
   Example: tomcat server , DispatcherServlet...

6. Spring boot do not uses XML for configurations.

7. All dependecies in spring boot are given as group and named as spring-boot-starter.*
                                                                   spring-boot-starter.web, spring-boot-starter.jdbc, spring-boot-starter-data-jpa, spring-boot-starter-test, .....

spring-boot-starter-web dependencies
               - spring core
               - spring context
               - jackson 
               - tomcat container
               - logging
               
spring-boot-starter-test dependencies
            - junit
            - hamcrest
            - mockito

spring-boot-starter-parent (main dependency)
          - decide the versions for all the dependencies to be added in the project
          - maven plugin version


============================================================
In spring, we configure tomcat server as plugin

To run the project , right click -> Run on server(give web app to the tomcat for deployment)


In Spring boot, tomcat is embedded as a jar file within the project itself
So, to build and run application, right click project -> run as -> Java application

Spring Boot decides for Tomcat 

              - version 9X
               - port :8080 (Configuration) : I can customize the configuration


COnfiguration are opf 2 types
  - settings like port number, datbase URL, username, password, enable security - application.properties
  - beans / objects created in the spring container


spring boot project starts at runtime
======================================
 - starting tomcat server : 8080
 - Created the spring container in the memory
 - Created the default beans / objects in the container
    In case of Web application, it will create 2 beans in the container: DispatcherServlet and InternalViewResolver for JSP View
 - Configures REST API

Revision
==========================================================
Spring Boot is a project that makes spring application development faster with managing dependencies and autoconfiguration 

Autoconfiguration means - auto configuring settings and beans in the spring container  at the runtime

========================================================

Problem statement : on url : http://localhost:8090 , display "welcome to spring boot" (String) - done 
                                    url : http://localhost:8090/products , send List of products to client (List) - Pending (tomorrow)

If you want to send HTML content -> use M-V(JSP)-Controller
If you want to send Data  -> Use M-RESTController with Jackson

Jackson API -> used to convert Java Object into JSON (Java Script Notation Object) format and vice-versa

What is REST - REpresentation State Transfer that can transform object data on server into Formats llke JSON, XML, text, and so on.

Example: https://www.instantwebtools.net/fake-rest-api


http request :  https://api.instantwebtools.net/v1/airlines
 Client App------------------------> Web application
           <----------------------
         http response     Data [{  }, {  }, {  }, {   }...]


 HTTP Request:  Request URL + HTTP Method (GET) + Request Body (optional)

HTTP Response :  Response Body - Data ({"id":1,"name":"Sri Lankan Airways","country":"Sri Lanka","logo"...} {}] in JSON Format / XML format
                +
                          HTTP Status Code: 304 
                +
                         HTTP Status message : Not modified

To develop application that can send data to the client in spring
we will use @RestController

@RestController - 
=============================================================
* Spring RestController annotation is used to create REST API using Spring MVC
* Spring RestController takes care of mapping request data to the defined request handler method.
* Once response body is generated from the handler method, it converts it to JSON or XML response


@RestController 
class WelcomeController{
   @RequestMapping(value="/")
   public String message(){
      return "welcome to spring rest";
   }
}




