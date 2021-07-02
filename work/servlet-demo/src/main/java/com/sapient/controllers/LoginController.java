package com.sapient.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.beancreater.LoginCreator;
import com.sapient.beans.Login;
import com.sapient.service.LoginService;

@WebServlet("/web-content/html/loginvalidate")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Login login = LoginCreator.createLoginBean(request);
		response.setContentType("text/html");
		if (new LoginService().loginValidate(login)) {
			request.getRequestDispatcher("/home-page").forward(request, response);
		} else {
			response.getWriter().println("<h2 style={color:\"red\"}>Invalid Credentials</h2>");
			request.getRequestDispatcher("/web-content/html/loginvalidate.html").include(request, response);
		}
	}

}
