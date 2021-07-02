package com.sapient.beancreater;

import javax.servlet.http.HttpServletRequest;

import com.sapient.beans.Login;

public class LoginCreator {
	private LoginCreator() {

	}

	public static Login createLoginBean(HttpServletRequest request) {
		Login login = new Login();
		login.setUserName(request.getParameter("user-name"));
		login.setPassword(request.getParameter("password"));
		return login;
	}
}
