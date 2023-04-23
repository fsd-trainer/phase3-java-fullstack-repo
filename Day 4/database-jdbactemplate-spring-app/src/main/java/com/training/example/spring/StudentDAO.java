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
	
	
	
	
}
