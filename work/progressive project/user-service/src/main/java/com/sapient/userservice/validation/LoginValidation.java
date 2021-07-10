package com.sapient.userservice.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.userservice.entity.User;
import com.sapient.userservice.repo.UserRepository;

@Service
public class LoginValidation {
	@Autowired
	static UserRepository repository;
	private LoginValidation() {
	}

	public static boolean isUserValid(User user) {
		User trueUser = repository.findIdByEmail(user.getEmail()).get(0);
		if (trueUser == null)
			return false;
		if (!trueUser.getPassword().equals(user.getPassword()))
			return false;
		user.setUid(trueUser.getUid());
		user.setUsername(trueUser.getUsername());
		user.setGender(trueUser.getGender());
		return true;
	}
}