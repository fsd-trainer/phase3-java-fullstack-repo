package com.training.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveStudent(Student s){  
	    String query="insert into students values('"+s.getId()+"','"+ s.getName()+"','" +s.getMobile()+ "','" + s.getCountry() +"')";  
	    return jdbcTemplate.update(query);  
	}  
	
	
	/**
	 *  Method to update student data in the DB table
	 */
	public int updateStudent(Student s) {
		
		return 0;
	}
	
	public int deleteStudent(int id) {
		return 0;
	}
	
	public void getStudents() {
		
	}
		
}
