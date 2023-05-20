package com.example.springboot;

import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springboot.dao.User;
import com.example.springboot.dao.UserRepository;

@SpringBootApplication
public class SpringRestJpaDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(SpringRestJpaDemoApplication.class, args);
	
	// to ask a bean from the container
	
	 UserRepository repositoryBean =   context.getBean(UserRepository.class);
	
	 // test adding a new user object in the database
	 /*User user1 = new User();
	 user1.setId(2);
	 user1.setPersonName("jill");
	 user1.setEmail("jill@abc.com");
	 user1.setCity("UK"); */
	
	  /* // first run select query to check if record with id 2 already exist
	        
           else insert query
	  */
	 //repositoryBean.save(user1); 
	 
	 /*User user2 = new User();
	 user2.setId(2);
	 user2.setPersonName("peter");
	 user2.setEmail("peterl@abc.com");
	 user2.setCity("LA");
	 repositoryBean.save(user2); */
	 
	 // display all user details
	 Iterable<User> iterable =    repositoryBean.findAll();
	 for (User user : iterable) {
		System.out.println(user);
	}
	 
	 // retrieve user based on id
	// Optional class is a wrapper on object and it is used to check null
	Optional<User>  optional =    repositoryBean.findById(1);
	 if(optional.isPresent()) {
		User user =   optional.get();
		System.out.println(user);
		
	 }
	 
	 
	 // delete the user from database
	 
	}

}
