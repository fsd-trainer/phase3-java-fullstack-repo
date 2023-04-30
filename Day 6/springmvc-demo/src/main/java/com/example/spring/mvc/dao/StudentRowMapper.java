package com.example.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	// this is the code to be added byu JDBCTemplate within the while(rs.next()){..}
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	Student s = new Student();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setMobile(rs.getLong(3));
		s.setCountry(rs.getString(4));
	 return s;
		
	}

}
