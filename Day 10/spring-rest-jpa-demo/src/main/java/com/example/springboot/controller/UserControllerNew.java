package com.example.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dao.User;
import com.example.springboot.dao.UserRepository;
import com.example.springboot.exceptions.UserNotFoundException;
@RestController
@RequestMapping("api/v2")
public class UserControllerNew {

	// To retrieve data from MYSQL Database, we need object of USerRepository
	private UserRepository repository;
	
	// object of USerREpository will be given at runtime in the constructor
	public UserControllerNew(@Autowired UserRepository repository) {
		this.repository = repository;
	}
	
	// To send the complete HTTP Response packet with header and body use ResponeEntity
	@GetMapping(value="/users", produces = "application/json")
	public ResponseEntity<List<User>> getAllUsers(){
		
		 List<User> userList =   (List<User>) this.repository.findAll();
		 return new ResponseEntity<List<User>>(userList, HttpStatus.OK); 
	}
	
	
	//@RequestMapping(value="/users/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody // optional
	@GetMapping(value="/users/{id}", produces = "application/json")
	public ResponseEntity<User>  getUserById(@PathVariable("id") Integer id) {
		
	Optional<User>	optional =   this.repository.findById(id);
	
	if(optional.isPresent()) {
		User user = optional.get();
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
		
	 throw new UserNotFoundException();
	
	}
	
	
	
	// POST method should return the newly created user object to the client
	// POST method receives json object from client in the HTTP Request packet  (header + body: object)
	//@RequestMapping(value="/users", method = RequestMethod.POST)
	// @RequestBody will convert JSON object into Java object
	@ResponseBody // optional
	@PostMapping(value="/users", produces = "application/json", consumes = "application/json")
	public ResponseEntity<User> addNewUser(@RequestBody User user) {
		
	 User newUser = 	  this.repository.save(user);
	 return new ResponseEntity<User>(newUser, HttpStatus.CREATED); // httpstatus - 201 (Created)
	}
	
	@ResponseBody // optional
	@DeleteMapping(value="/users/{id}")
	public ResponseEntity<String> deleteUSerById(@PathVariable("id")  Integer id) {
		this.repository.deleteById(id);
		return new ResponseEntity<String>("User data deleted", HttpStatus.OK);
		
	}
	
	// we need to create a custom query method
	@ResponseBody // optional
	@GetMapping(value = "/users/name/{name}")
	public ResponseEntity<List<User>> getUserByName(@PathVariable("name") String str){
	List<User> returnList = 	this.repository.findBypersonName(str);
		return new ResponseEntity<List<User>>(returnList, HttpStatus.OK);
	}
	
	// Add PUT method
	
	// Retrieve List<user> page - wise
}
