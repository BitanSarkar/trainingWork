package com.sapient.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {

	}

	// will execute once only per application start
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">>>>> Init called <<<<<");
	}

	// will execute only per application end
	@Override
	public void destroy() {
		System.out.println(">>>>> Destroy called <<<<<");
	}

	// per user request
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(">>>>> Service called <<<<<");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlets</h1>");
		out.println("</body>");
		out.println("</html>");
	}

	// if you have post only then make a get request - 405 Error
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
