package com.example.springboot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/*
 * Spring Data JPA will create class and implement UserRepository interface 
 * and generated all method implementations code automatically
 * No need to add @Repository annotation on interface
 * 
 * class Myclass implements CrudRepository{
 *internally jpa will generate
 *  save(){
 *    Connection conn DatabaseManager.getConnection(..);   
 *    Preparedstatement pstmt = Connection.preparedStatment();
 *    pstmt.executeQuery("insert into users values(?,?,?,?)");
 *  }
 */
public interface UserRepository extends CrudRepository<User, Integer> {

	/*
	 *                           save()
	 *                           saveAll()
                                 findById()
                                 findAll()
                                 existsById()
                                 deleteById()
                                 delete()
	 * 
	 */
	
	 /*
	  * // to retireve all users from table
	  
	  public List<User>  getAllUSers();
	  // to retireve single user based on id
	  public User getUSerById(Integer id);
	  // to add a new user 
	  public void addNewUser(User user);
	  // to add delete user
	  public void deleteUSer(Integer id);
	  
	  */
	  
}
