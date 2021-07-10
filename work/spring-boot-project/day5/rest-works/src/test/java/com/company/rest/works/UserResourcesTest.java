package com.company.rest.works;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.company.rest.works.model.User;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserResourcesTest {

	@LocalServerPort
	private int port; 
	
	@Autowired
	private TestRestTemplate testRestTemplate; 
	
	@Test
	void checkConnection() {
		String message = "User Service is UP and RUNNING";
		assertEquals(message, testRestTemplate.getForObject(testRestTemplate.getRootUri() +"/", String.class)); 
	}

	@Test
	public void getAllUsersTest() {
		List<User> list = testRestTemplate.getForObject(testRestTemplate.getRootUri() +"/users", List.class); 
		
		System.out.println(list);		
		assertEquals(3, list.size());
	}
	
	@Test
	public void getUsersByIdTest() {
		User dummyUser = testRestTemplate.getForObject(testRestTemplate.getRootUri() +"/users/101", User.class); 
		
		System.out.println(dummyUser);		
		assertEquals("Sushruth", dummyUser.getName());
	}
}
