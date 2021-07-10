package com.sapient.userservice.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.userservice.entity.User;
import com.sapient.userservice.repo.UserRepository;

import antlr.collections.List;

@Service
public class RegistrationValidation {
	@Autowired
	static UserRepository repository;
	private RegistrationValidation() {
	}

	public static boolean isNewUser(User user) {
		List trueUser = (List) repository.findIdByEmail(user.getEmail());
		if(trueUser==null) return true;
		return false;
	}
}