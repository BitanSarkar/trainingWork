package com.sapient.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/web-content/html/registration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("user-name");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] interests = request.getParameterValues("interest");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Registration Details</h1>");
		out.println("<h4>User name is " + userName + "</h4>");
		out.println("<h4>Password is " + password + "</h4>");
		out.println("<h4>Gender is " + gender + "</h4>");
		out.println("<h4>Interests are :</h4>");
		out.println("<table border=\"2px\"");
		for (String interest : interests) {
			out.println("<tr><td>" + interest + "</td></tr>");
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		doGet(request, response);
	}

}
