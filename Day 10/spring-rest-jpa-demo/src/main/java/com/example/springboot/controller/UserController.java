package com.example.springboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dao.User;

// This class will be REST API. GEnerate HTTP Responses to be sent to the client application
// The client applications should know HTTP protocol - Postman 
@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	
	@ResponseBody // this method can generate HTTP Response. Internally this annotation is applied - optional to apply
	//@RequestMapping(value = "/users", method = RequestMethod.GET)
	@GetMapping(value="/users", produces = "application/json")
	public List<User> getAllUsers(){
		
		return null;
		
	}
	
	// To send the complete HTTP Response packet with header and body
	public ResponseEntity<List<User>> getAllUserswithResponseEntity(){
		return null;
	}
	
	
	//@RequestMapping(value="/users/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody // optional
	@GetMapping(value="/users/{id}", produces = "application/json")
	public User getUserById(@PathVariable("id") Integer id) {
		return null;
	}
	
	
	
	// POST method should return the newly created user object to the client
	// POST method receives json object from client in the HTTP Request packet  (header + body: object)
	//@RequestMapping(value="/users", method = RequestMethod.POST)
	@ResponseBody // optional
	@PostMapping(value="/users", produces = "application/json", consumes = "application/json")
	public User addNewUser(@RequestBody User user) {
		return null;
	}
	
	
	@ResponseBody // optional
	@DeleteMapping(value="/users/{id}")
	public void deleteUSerById(@PathVariable("id")  Integer id) {
		
	}
	
	@ResponseBody // optional
	@GetMapping(value = "/users/name/{name}")
	public List<User> getUserByName(@PathVariable("name") String personName){
		return null;
	}
	
}
