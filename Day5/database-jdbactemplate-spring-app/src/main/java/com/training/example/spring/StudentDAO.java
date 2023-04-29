package com.training.example.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDAO {

	private JdbcTemplate jdbcTemplate; // I need object of JDBCTemplate in this object at runtime

	@Autowired
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// perform insert query
	public int saveStudent(Student s) {
		// in database string - ''
		String query = "insert into students values('" + s.getId() + "','" + s.getName() + "','" + s.getMobile() + "','"
				+ s.getCountry() + "')";
		return jdbcTemplate.update(query);
	}

	/**
	 * Method to update student data in the DB table
	 */
	public int updateStudent(Student s) {
		// Update query
		String query = "update students set mobile='" + s.getMobile() + "' ,country='" + s.getCountry() + "' where id='"
				+ s.getId() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteStudent(int studentId) {
		String query = "delete from students where id='" + studentId + "' ";

		return jdbcTemplate.update(query);
	}

	// run select query - may return multiple records
	public List<Student> getStudents() {
		String sql = "SELECT * FROM  students";
		List<Student> list = jdbcTemplate.query(sql, new StudentRowMapper());
		return list;
	}

}
