 Topics completed so far
================================
Spring framework = spring core = spring IOC container


 Spring IOC container will create objects and wire dependencies 

 To wire depenendencies, spring IOC container implements a design pattern called as dependency injection 


class A {

  B ; // object of B will be create and wired into A object by Spring IOC (inversion of control)
  C
  D

}

* How to guide spring IOC container to manage objects and wire dependencies?

   By writing configuations

            - XML  <beans>
                                <bean .... > </bean>
                       </beans>

                           ref-  manually say which to bean to wire


           - Annotations 

                                @Component- Register a class object in the spring container. class-level annotation
                                @ Value - to intilaize properties of object during creation
                                     - need application.properties (key=value)
                                @Autowired - field, constructor method , or setter method of class, the required bean or object 
                                              will be injected in the property

Singleton Scope by default
==============================
spring container follows singleton scope for beans in container ( 1 class = 1 object in container)

That means, any class applied with @Component will have single object of that class in the spring container.

===================================================
 In large application - need for database or web application

Java Databse Connectivity (JDBC)
 JDBC <---------> Database - RDBMS - Tables (ROWs & Columns)
                                     MySQL (RDBMS)      

traditional Code you write uisng JDBC API
============================================     
try{
class.forName("com.msql.cj.jdbc.Driver") 
Connection conn = DriverManager.getConnection("URL");  
Statement object ; 
Resultset rs = stmt.executeQuery("select * from students"); 
 ResultSet object will be created by JDBCTemplate
while(rs.next()){  
  // get data from rs 
} 
}catch(SQLException){}

                    
 With JDBCTemplate class, some task will be performed by JDBCTemplate and some by developer.
==================================================
JDBCTemplate (70%)
  Connection'
  Statement
  ResultSet
  Exception handling
  writing while(){ }


Developer (30%)
  - Connection URL details
  - Query
  - for returned table for select query - which objects should be populated with the data 
 within while loop code to be generated
                        id = rs.getInt(1)
                         name = rs.getString(2)
                        Student s = new Student(id, name, ..); - developer


Advantage of using JDBCTemplate (Spring) over JDBC
 
- It generates the JDBC boilerplate code  internally(less code)
- development becomes faster
- provides us the methods to write the queries directly

===================================================================
How to open download project in Eclipse
  Eclipse : File -> Import -> Maven -> Existing Maven Project -> project folder with pom.xml


==================================================================
Demonstration : perform CRUD operations using JDBCTemplate class

1. Env ready (project structure)

2. pom. xml - spring-context, spring-jdbc

<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>5.3.22</version>
		</dependency>

           <dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<version>8.0.31</version>
		</dependency>

3. We will need JDBCTemplate object which is a Spring class - configure in xml

    <bean   class="JDBCTemplate">

        <constructor-args ref="ds"/>
   </bean>

JDBCTemplate object needs DataSource object.

4. Test the bean creation in the container.
ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");
		
		System.out.println("container ready...");



5. Use JDBCTemplate object in StudentDAO

studentDAO Object<======>jdbcTemplate<=====> DataSource Object
                   autowired          autowired

6. write the saveStudent() to insert record in the database

7. tested the method by invoking bean from the container.

8. complete the remaining methods and their testing code.


Whenever your custom class - Add @Component at class-level for that class. 
Example
@Component
class Person{

}

What if it is a spring class or external class with no .java file?
then, how to ask spring container to create object of a spring class
       
     - if using xml - <bean  name="jdbctemplatebean" class="org.springframework.jdbc.core.JDBCTemplate>
                              </bean>

      - if no xml (spring boot) - use @Configuration + @Bean annotation                           


=============================================================================

Demonstration - creating student management web application using spring Web mvc module 

Web application (Jav/ .NET/ Python) is based on MVC architecture

        HTTP Request - URL http://localhost:8080/abc
  Web client -------> Web Server (Web application)       
  [Web Browser]                  (M-V-C architecture)
            <-------------
            HTTP Response (HTML Output)
 

  Model - represents Data (Objects)- Student <--------> Database

  View - Creates UI (user interface)as HTML to be sent to the client (browser) 

  Controller - takes the request from client and process it , update model and identify the view that will send response back to the client

Spring Web MVc architecture

1. The DispatcherServlet is the front controller in Spring web applications.

2. DispatcherServlet  is the root Servlet in the application.

3. DispatcherServlet is a class that receives the incoming request and maps it to the right resource such as controllers, models, and views.

4. The DispatcherServlet gets an entry of handler mapping for the controllers and forwards the request to the controller.
example
studentcontroller- controllers will define URLs
        http://localhost:8080/students/add 
                                        /students/show
                                        /students/post

FacultyController
           http://localhost:8080/faculties
           http://loclahost:8080/faculties/subject

5. The controller returns an object of ModelAndView.

6. The DispatcherServlet checks the entry of view resolver in the XML file and invokes the specified view component.

=================================================================
 How many components needs to be configured in the web application

Spring class
    - DispatcherServlet
    - ViewResolvers 

Custom classes
       - controller (s)
       - model (data)
       - view (S)
==========================================================
Demonstration : Display student details on a Web page.

1. A web project in maven, add spring dependencies (spring-context, spring web mvc)

 Eclipse
 Java
 Web Server (Tomcat 9.0+)
 MySQL

to resolve errors in web project
================================================
  1. in index.jsp page .. no servletHttp found - to fix, right click project -> properties -> traget runtime -> Apache Tomcat 
 
   2. In pom.xml ...could not initialize class org.apache.maven.plugin.war.util.WebappStructureSerializer
    solution -  add this dependencies in <build>  </build>
   
          <build>
		<finalName>spring-web-mvc-demo</finalName>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>3.3.1</version>
			</plugin>
		</plugins>
	</build>
