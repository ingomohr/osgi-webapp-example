package org.osgi.webapp.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 4085391411655563165L;

	@Override
	protected void doGet(HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws ServletException, IOException {

		try (final PrintWriter out = pResponse.getWriter()) {
			out.println("<html><body><h2>OSGi WebApp Example</h2><p>Hello World!</p></body></html>");
		}
	}

}