package com.company.rest.works.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.company.rest.works.exception.*;
import com.company.rest.works.model.User;
import com.company.rest.works.services.UserService;

@RestController
public class UserResource {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String hello() {
		return "Working....";
	}

	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}	
	
	@GetMapping(value = "/users/{id}")
	public User getUserAsObject(@PathVariable("id") Integer id) throws UserNotFoundException {
		var user = userService.getUserByIdAsObject(id);
		
		if(user == null) {
			throw new UserNotFoundException("user Not Found with id:  " + id ) ;
		}
		
		return user; 
	}
	
	@PostMapping(value = "/users") 
	public User saveUser(@RequestBody User user) throws DuplicateUserException {
		User userSaved = null;
		try {
			userSaved = userService.saveUser(user);
		} catch(Exception e) {
			System.err.println("Duplicate >>>>>>>>>>>>>>>>>>");
			throw new DuplicateUserException("User already registered with given ID: " + user.getId().toString()) ;
		}
		
		return userSaved; 
	}
	
	@PutMapping(value = "/users")
	public User updaUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping(value = "/users/{id}") 
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}
	
	@GetMapping(value = "/users", params = "name")
	public List<User> getUsersByName(@RequestParam("name") String name) {
		return userService.getAllUserByName(name);
	}
	
	@GetMapping(value = "/users", params = "sal")
	public List<String> getAllNamesGtSalary(@RequestParam("sal") double sal) {
		return userService.getAllUsersGtSalary(sal);
	}
}










