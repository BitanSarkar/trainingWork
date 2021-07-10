package com.sapient.userservice.beancreater;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.sapient.userservice.beans.Login;

public class LoginCreator extends HttpServlet {
	private LoginCreator() {

	}

	public static Login createLoginBean(HttpServletRequest request) {
		Login login = new Login();
		login.setEmailId(request.getParameter("email"));
		login.setPassword(request.getParameter("password"));
		return login;
	}

}
