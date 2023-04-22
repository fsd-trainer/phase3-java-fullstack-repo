Last Session - Spring Core Module = Spring framework contains Spring Container

<bean>
    <!-- to initialize object properties -->

    <constructor-args  />    // to invoke constructor to initialize property

   <property   />   // to invoke setter method for that property

</bean>


To create objects by spring container from multiple xml config files
====================================================================
1. Write the Java class
   a. Audio - length
   b. Video - format (mp4. wvm)
2, Configuration of Java class 
                a. xml files  (we are doing currently)
                b. annotations (Day 4 class covered)
              
3. Start/ Create the container
4. Look if beans (objects) are created in the container
5. Ask for the bean from the container


class Video{
     String format

   // default constructor


  // getter and setter

  // String videoFormat(){

  }

}

Overloaded method parameters and return types are different for getBean()
=========================================================
    Object  <------------------- getBean("name of bean");// we need to typecast the Object
     Class      <--------------    getBean("Class name"); // we do not need any type casting


=========================================================
 MessageService
    - needs two objects to work : Audio and Video object


// parameterized constructor
// you should create required object in the constructor
// When class create (managed) their dependent objects 
//CODE IS HARDER TO TEST

	public MessageService1(String textMsg) {
		System.out.println("Parameterized constructor of MessageService called : textMsg");
	     this.textMsg = textMsg;
	     this.audio = new Audio(60L);
	     this.video = new Video();
	     this.video.setFormat("wmv");
	     
	 	}

When MEssageService1 class is tested: it also needs to test its dependent object (Audio & Video).

Solution: Transfer the task of create and injecting
dependent object of someone  


1. Who is going to create dependent object and  inject those object in the object who ask for dependent objects  -> Spring Container 

Theory
===============================================
providing deopendent object or wiring dependent object called as `DEPENDENCY INJECTION`

What is dependency injection (DI)  in Spring
 - It is a design pattern where the dependent objects are injected into the required objects.


Who is implementing the DI pattern in spring  - Spring Container, it will inject dependencies at the runtime 

Lab
=========================================
How to implement DI in spring applications?

1. Create the Java classes
2. Configure the classes in XML files and mention which object needs the dependent object in XML file

class Person{
  Address address
  int personID;
}
   <bean class="Person">
    <constructor-args name="address" ref="<name of the bean>"/>  
     <constructor-args name="personID" value="10" />

  </bean>


  <bean name="addressBean" class="Address">

 </bean>

* ref - is a property to inject the depeendent object

3. Start the container and look for objects getting its dependent objects

4. Test it by ask for the beans from the container


=========================================================
* Analogies to understanding dependency Injection

When a house (object) is build: it needs dependent material (object) to be build

bricks -------------> purchase from vendor
cement -----------> purchase from vendor
sand
water
metals
wiries
plumbing

get all dependent obejcts when the actual work begins for constructing of the house

=================================================

Tomorrow agenda - To configure bean and their dependencies using annotations


Notes + Codes will be shared on the github link in next 30 mins.










