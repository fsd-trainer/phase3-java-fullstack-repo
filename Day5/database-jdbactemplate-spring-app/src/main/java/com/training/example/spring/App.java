package com.training.example.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext container = new ClassPathXmlApplicationContext("springbean.xml");

		System.out.println("Container is ready");
		System.out.println("====================================================================");

		/*
		 * Student student1 = new Student(); student1.setId(5);
		 * student1.setName("priyanka"); student1.setMobile(6989967L);
		 * student1.setCountry("India"); StudentDAO dao =
		 * container.getBean(StudentDAO.class); dao.saveStudent(student1); // has insert
		 * query
		 * 
		 * System.out.println("Check in the database for new record to be added...");
		 */

		/*
		 * System.out.println(
		 * "========================================================="); Student student
		 * = new Student(); student.setId(5); student.setName("priyanka");
		 * student.setMobile(8976543); student.setCountry("Japan"); StudentDAO dao =
		 * container.getBean(StudentDAO.class); int rows = dao.updateStudent(student);
		 * 
		 * System.out.println("Number of rows updated - " + rows);
		 * 
		 * 
		 * System.out.println("=====================================================");
		 * 
		 * int id = 4; rows = dao.deleteStudent(id);
		 * 
		 * System.out.println("Number of rows deleted  - " + rows);
		 * 
		 * System.out.println("======================================================");
		 * 
		 */

		System.out.println("===========================================");
		StudentDAO dao = container.getBean(StudentDAO.class);
		List<Student> list = dao.getStudents();
		for (Student student : list) {
			System.out.println(student); // student.toString()
		}
	}
}
