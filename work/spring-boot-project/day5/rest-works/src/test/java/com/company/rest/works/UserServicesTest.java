package com.company.rest.works;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.company.rest.works.model.User;
import com.company.rest.works.repo.UserRepository;
import com.company.rest.works.services.UserServices;

@SpringBootTest
class UserServicesTest {

	@Autowired
	private UserServices userService;
	
	@Autowired
	private UserRepository userRepo;
	
//	@BeforeEach
//	public void setUp() {
//		Optional<User> user = Optional.of(new User(101, "Joe", 3200.00, new Date()));
//		
//		List<User> list = Arrays.asList(new User(101, "Joe", 3200.00, new Date()),
//				new User(102, "Mack", 7800.00, new Date())); 
//		
//		when(userRepo.findAll()).thenReturn(list);
//		when(userRepo.findById(101)).thenReturn(user);
//	}
	
	@Test
	@DisplayName(value = "whenProducts_thenCheckForMinimumOneEntry")
	void whenAllUsers_thenCheckForMinimumOneEntry() {
		assertTrue(userService.getAllUsers().size() >= 1);
		
	}
	
	@Test
	@DisplayName(value = "Check if User with given ID exists")
	void whenUserIdGiven_thenCheckIfExistsTest() {
		
		assertEquals("Sushruth", userService.getUserByIdAsObject(101).getName());
	}
	
	
	

}
