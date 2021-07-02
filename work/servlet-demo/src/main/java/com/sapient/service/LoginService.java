package com.sapient.service;

import com.sapient.beans.Login;

public class LoginService {
	public boolean loginValidate(Login login) {
		return (login.getUserName().equals("india") && login.getPassword().equals("sapient"));
	}
}
