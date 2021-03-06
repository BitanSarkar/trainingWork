package com.sapient.userservice.beancreater;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.sapient.userservice.beans.Registration;

public class RegistrationCreator extends HttpServlet {
	private RegistrationCreator() {

	}

	public static Registration createRegistrationBean(HttpServletRequest request) {
		Registration reg = new Registration();
		reg.setUserName(request.getParameter("user-name"));
		reg.setEmailId(request.getParameter("email"));
		reg.setPassword(request.getParameter("password"));
		reg.setGender(request.getParameter("gender"));
		return reg;
	}

}