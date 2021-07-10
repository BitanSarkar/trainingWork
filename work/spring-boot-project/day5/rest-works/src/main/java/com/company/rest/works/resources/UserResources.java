package com.company.rest.works.resources;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.rest.works.model.User;
import com.company.rest.works.services.UserServices;

@RestController
//@RequestMapping("/userService")
public class UserResources {

	@Autowired
	private UserServices userService;
	
	@Value(value = "${server.port}")
	private String port;
	
	@GetMapping("/")
	public @ResponseBody String hello() {
//		return "User Serivce is UP ... Running on Port - " + port;
		return userService.sayStatus();
	}
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}
	

	@PostMapping("/insert")
	public User insertUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/delete")
	public boolean deleteUser(@RequestBody User user) {
		userService.deleteUser(user);
		if(userService.getUserByIdAsObject(user.getId()) != null){
			return false;
		}else { 
			return true;
		}
	}
	
	@GetMapping("/userByName")
	public List<User> getUsersByName(@RequestParam("name") String name){
		return userService.getAllUsersByName(name);
	}
	
	@GetMapping("/salary")
	public @ResponseBody List<User> getUsersByName(@RequestParam("salary") Double salary){
		return userService.getGreaterThanSalary(salary);
	}
	
}
