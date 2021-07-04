package com.sapient.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.userservice.entity.User;
import com.sapient.userservice.repo.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository repository;

	@PostMapping("/create_dummy")
	public String create() {
		repository.save(new User("bitan", "bita@xx.com", "1234", "male"));
		return "Customer created";
	}
}
