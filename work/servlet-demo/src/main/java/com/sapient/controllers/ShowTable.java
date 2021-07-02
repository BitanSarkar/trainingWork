package com.sapient.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/web-content/html/showtable")
public class ShowTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number = request.getParameter("number");
		System.out.println(number);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		try {
			int n = Integer.parseInt(number);
			out.println("<h1>Number table of " + n + "</h1>");
			out.println("<table border=\"2px\"");
			for (int i = 1; i <= 10; i++) {
				out.println("<tr><td margin=\"2px\">" + n + " x " + i + " = " + (n * i) + "</td></tr>");
			}
			out.println("</table>");
		} catch (NumberFormatException e) {
			out.println("<h1>NOT A VALID INPUT</h1>");
			request.getRequestDispatcher("/web-content/html/showtable.html").include(request, response);
			e.printStackTrace();
		}
		out.println("</body>");
		out.println("</html>");
	}

}
