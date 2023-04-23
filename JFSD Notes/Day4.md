*.md - more readability in Visual Studio Code

Disadvantages of tightly coupled code

  - The code which manages its dependent object (s) is not easy to test 
  - Any changes in the dependent class, will affect the class who has created its object
    Example : if constructor of Address class is updated with new parameter, all classes who have created object of it, needs to be updated.



Golden rule of programming
 
   - Your code should be loosely-coupled-code 
    - Your class should be highly-cohesive

Advantages of lossely-coupled code
========================================
1. Any changes done on the dependencies will not affect the class who needs its object
2. lossely-coupled applications are easy to test

===========================================================================

Configuration of spring
 - XML file (s) 
 - Annotations - today we will cover 
 - Pure Java-based configuration


======================================================================
What are annotations in Java?

syntax : @<<Annotation-name>>(attribute1="", attribute2="")
               or
         @<<Annotation-name>>


   <company> apple </company>
   company is metedata.
  company - metadata gave additional information about the program.

      - Fruit
      - Company
      - Mobile
      - Accessory


Annoatations are metadata that provide information about program to java compiler/ java runtime/ spring framework
Annotations can be applied at
 - class-level, 
 - property-level, or 
 - method-level

Spring framework has already created the annotations to be used in the applications.

Annotations are internally proceed into XML configuration


Lab  - To configure beans in container using annotations
===========================================================================
1. Creating java class (s)

2. Write .xml file and in it add these two tags:
<!-- Enable support of annotation in the application -->
	<context:annotation-config />

<!-- Every class of the package will be scanned for annotations by spring 
		container -->
	<context:component-scan
		base-package="com.training.example.spring"></context:component-scan>



3. Annotate the class (es) with @Component annotation

4. Creating container to register objects in it 


XML configuration to register bean
=======================================
<bean name=""  class="">
   <constructor-args />
   <property /> 
  </bean> - tag is used to register beans in the container

  @Component    - used to register the bean in the cointainer. It is a class-level annotation.
  @Component("<<bean-name>>")
  
  if @Component is not given with bean name, then sporng container will give the name of bean same as class name (in lower-case)

           @Component // bean name will be person
  Example: class Person{}


How a bean can be initialized with the values in the container
 - use @Value annotation
================================================================
LAb

1. Write a Java class with properties.
2. You need to define properties values in a property file (*.properties)

    property is a key-value file
      key = value
   example: person.id=10
            person.name=john mathew   

3. The property file is created under src/main/resources folder

4 in the class, annotation the proerties with @Value annotation
  
   @Value("expression")   ----------> @Value("${person.id}")

5.  You can apply @Value() on constructor argu or setter method


6. Add the xml contfiuration for <context: property-placeholder...>

6. Start the container and look for beans


Objects are initialized in the spring container and sequence to intailize properties

  1. invoke constructor  - default constructor (Java)  + no-args constructor or parameterized constructor
  2. Setter method 

==============================================================================

With annotations, container can scan the dependencies and inject them in the required bean object. This concept is called as AUTOWIRING.


Autowiring - Spring container will find the dependent object (s) and automatically wire that depenendent object in the bean


Autowiring can be done at 3 level
 - field or property of class -  setter injection . it calls setter method to do the injecting 
 - constructor method - injecting will be done at the constructor level
 - setter method - setter injection - setAddress(address)
 ===============================================================================

Lab - wiring of beans in the spring container using annotations.

To do manual wiring of 2 beans in the container, we used <constructor-args  name="address"  ref="addressBean"/>

Through annotation, we will use @Autowired annotation


// constructor injection
	public Employee(@Value("${employee.id}")long employeeId, @Value("${employee.name}") String employeName, @Autowired Department department, @Autowired Project project) {
		this.employeeId = employeeId;
		this.employeName = employeName;
		this.department = department;
		this.project = project;
	}

or

// constructor injection
	@Autowired
	public Employee(@Value("${employee.id}")long employeeId, @Value("${employee.name}") String employeName, Department department, Project project) {
		this.employeeId = employeeId;
		this.employeName = employeName;
		this.department = department;
		this.project = project;
	}



we did two examples:  autowiring with property and autowiring with constructor method

====================================================================

LAb  - doing CRUD operation using JDBCTemplate API in spring

boilerplate code
=============================================================
connect to database - JDBC API
try{
Connection conn = DriverManager.getConnection("...");
Statement object
Resultset rs = stmt.executeQuery("select * from students");
while(rs.next()){
  // retrieve data in the loop
}
}catch(SQLException){}

disadvatage of JDBC

 - Lot of boilerplate code 
 - Handle exceptions
 -  we may need to repear same boiler plate code multiple times

Spring > api called as JDBCTemplate 

JDBCTemplate will abstract all boilerplate code which you write in JDBC.
Result : as developer, I can  focus on writing queries (insert, update, delete, select) in the application

Example: Excel an abstraction over that calculator 


lab code is available in database-jdbctemplate-app
===============================================================================