To create a Spring Web MVC app with DAO layer

Application architecture

Client <--->DispatcherServlet<-->StudentController<--> StudentDAO 
                                                           |
                                                          MySQL    DB

Application will display student list and allow to add new student to DB
========================================================
To run application : http://localhost:8080/springmvc-demo/index.jsp

When clicked on View Student -> Displays list of students from DB
When clicked on Add Student -> Shows form to fill and add the new record in the DB

=============================================================
Maven depenencies requiredd

1. spring webmvc
2. spring jdbc
3. mysql connecter
4. jstl
5. servlet api

Build a Web page to display students from db
=============================================
1. Configure Dispatcher Servlet
2. Create a Configuration file (IntervalViewResolver, JDBCTemplate, DataSource)beans
3. Create a controller class (StudentController)
4. Annotate it with @Controller
5. Autowire StudentDAO bean in it
@Autowired
	public StudentController(StudentDAO studentDAO) {
		System.out.println("StudentController bean is registered in the spromng container");
		this.studentDAO = studentDAO;
	}
5. Write a method to retirive student list from thd db
6. Annotate the method with @RequestMapping
@RequestMapping("/show/students")
	public String loadStudents(Model model) {
		
	 // model which holds data	
	  List<Student> studentList = this.studentDAO.getStudents();
	  System.out.println(studentList);
	  
	  model.addAttribute("student", studentList);
	  
	return "show-student"; // name of the view
	}

 7. Add show-student.jsp page
 8. Use jstl library to iterate over the studentList object and display it in the table on UI.

 ============================================================   

Build a Web page to add student record in the DB

1. Add a link in index.jsp page

<a href="studentform"> Add Student </a>

2. Add a new method in the StudentController class to display the student form

Concept : A form can be binded with a class object whose properties are populated by sring on form submission from browser.

use spring form tag library.


// show the form to the user
	@RequestMapping(value = "/studentform", method=RequestMethod.GET)
	public String showstudentForm(Model model) {
		// studentformdto object will get data from the form when submit is clicked
		StudentFormDTO studentFormDTO = new StudentFormDTO();
		model.addAttribute("addstudent",studentFormDTO);
		return "show-student-form"; // name of the jsp page
	}
	
 3. Add show-student-form.jsp page with spring form tags. Each element is binded with the StudentFormDTO property.


 4. When submit is clicked, then /save-student url will be fired with POST method
 POST method is used in HTTP to send form data securly to the server

 5. Add another method in StudenController class to retrieve data from StudentFormDTO object  and send it to StudentDAO object.
 // this method will receive studentFormDTO object populated with data from the form
	@RequestMapping(value = "/save-student", method=RequestMethod.POST)
	public String saveStudent(StudentFormDTO studentFormDTO) {
		System.out.println(studentFormDTO);
		
		// Create Student object to copy data from studentFormDTO object to it.
		   Student s = new Student();
		   s.setId(studentFormDTO.getId());
		   s.setName(studentFormDTO.getName());
		   s.setMobile(studentFormDTO.getMobile());
		   s.setCountry(studentFormDTO.getCountry());
		 
		   // call the DAO method saveStudent()
		    this.studentDAO.saveStudent(s);
		    
	   	   return "success-save-student"; // jsp page name
	}

6. Add success-save-student.jsp page to send message to the browser.



Annotations of Spring MVC
=================================

@Controller - to register bean in the container and handle Web HTTP request.

@RequestMapping - to define the URL on the server-side

Model class is a ready class in Spring MVc to transfer object from controller to JSP page based on KEy value
model.addAttribute("key", Object);

Spring form tags can be used on JSP page to bind form elements with a StudentFormDTO object properties.


