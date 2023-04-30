package com.example.spring.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.spring.mvc.dao.Student;
import com.example.spring.mvc.dao.StudentDAO;
import com.example.spring.mvc.formdata.StudentFormDTO;

@Controller
public class StudentController {

	private StudentDAO studentDAO;

	
	@Autowired
	public StudentController(StudentDAO studentDAO) {
		System.out.println("StudentController bean is registered in the spromng container");
		this.studentDAO = studentDAO;
	}

	
	// /show/students - http://localhsot:8080/springmve-demo/show/students
	// the method wiill be given with Model object has a key and  value pair
	@RequestMapping("/show/students")
	public String loadStudents(Model model) {
		
	 // model which holds data	
	  List<Student> studentList = this.studentDAO.getStudents();
	  System.out.println(studentList);
	  
	  model.addAttribute("student", studentList);
	  
	return "show-student"; // name of the view
	}
	
	// show the form to the user
	@RequestMapping(value = "/studentform", method=RequestMethod.GET)
	public String showstudentForm(Model model) {
		// studentformdto object will get data from the form when submit is clicked
		StudentFormDTO studentFormDTO = new StudentFormDTO();
		model.addAttribute("addstudent",studentFormDTO);
		return "show-student-form"; // name of the jsp page
	}
	
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
	
	
	
	
	
	
	
	
	
}
