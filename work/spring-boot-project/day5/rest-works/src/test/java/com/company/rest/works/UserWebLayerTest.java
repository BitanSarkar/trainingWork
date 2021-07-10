package com.company.rest.works;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.company.rest.works.model.User;
import com.company.rest.works.repo.UserRepository;
import com.company.rest.works.resources.UserResources;
import com.company.rest.works.services.UserServices;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest
class UserWebLayerTest {

	@Autowired
	private MockMvc mockMvc; 
	
	@MockBean
	private UserServices userService;
	
	@BeforeEach
	public void setUp() {

		String message = "User Service is UP and RUNNING";
		User user = new User(101, "Joe", 3200.00, new Date());
		Optional<User> opUser = Optional.of(user);
		List<User> list = Arrays.asList(new User(101, "Joe", 3200.00, new Date()),
				new User(102, "Mack", 7800.00, new Date())); 
		
		when(userService.sayStatus()).thenReturn(message);
		when(userService.getAllUsers()).thenReturn(list); 
		when(userService.getUserById(101)).thenReturn(opUser);
		when(userService.getAllUsersByName("Joe")).thenReturn(Arrays.asList(user)); 
	}
	
	@Test
	void testConnection() throws Exception {
		String uri="/"; 
		 mockMvc
		 	.perform(get(uri))
		 	.andDo(print())
		 	.andExpect(status().isOk())
		 	.andExpect(content()
		 		.string(containsString("User Service is UP and RUNNING")));
	}
	
	@Test
	void testGetUserById() throws Exception {
		String uri="/users/101"; 
		 mockMvc
		 	.perform(get(uri))
		 	.andDo(print())
		 	.andExpect(status().isOk())
		 	.andExpect(content()
		 		.string(containsString("Joe")));
	}
	
	
	@Test
	void testGetUsersByName() throws Exception {
		String uri="/userByName?name=Joe"; 
		 mockMvc
		 	.perform(get(uri))
		 	.andDo(print())
		 	.andExpect(status().isOk())
		 	.andExpect(jsonPath("$[0].name", is("Joe")));
	}
	
	@Test
	void testGetAllUsers() throws Exception {
		String uri="/users"; 
		 mockMvc
		 	.perform(get(uri))
		 	.andDo(print())
		 	.andExpect(status().isOk())
		 	.andExpect(jsonPath("$", hasSize(2)));
	}

}
