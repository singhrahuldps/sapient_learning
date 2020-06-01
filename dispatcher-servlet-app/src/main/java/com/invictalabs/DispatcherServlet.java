package com.invictalabs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		
		switch (url) {
			case "/getEmps":
				getEmployees(response);
				break;
			case "/getCustomers":
				getCustomers(response);
				break;
			case "/getProducts":
				getProducts(response);
				break;
			case "/":
				getHomePage(response);
				break;
			default:
				getUrlNotFoundPage(response);
		}
		
	}

	private void getHomePage(HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.getWriter().append("Welcome to the Shop! <br/>");
		response.getWriter().append("<a href='/getEmps'>Our Employees</a> ");
		response.getWriter().append("<a href='/getCustomers'>Our Customers</a> ");
		response.getWriter().append("<a href='/getProducts'>Our Products</a> ");
	}

	private void getProducts(HttpServletResponse response) throws IOException {
		response.getWriter().append("Product List");
	}

	private void getCustomers(HttpServletResponse response) throws IOException {
		response.getWriter().append("Customer List");
	}

	private void getEmployees(HttpServletResponse response) throws IOException {
		response.getWriter().append("Employee List");
	}

	private void getUrlNotFoundPage(HttpServletResponse response)  throws IOException {
		response.getWriter().append("Error: Invalid URL");
	}
	
}
