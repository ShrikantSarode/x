package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetServlet
 */
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() {
		System.out.println("Inside init()");
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside doGet()");
		// This method gets invoked when the serlvet is requested.
		// This method is sending html response back to client.

		// Setting the MIME type for HTML response
		// MIME=>Multi-purpose Internet Mail Extension(text/html)
		response.setContentType("text/html");
		// Obtaining a Writer object to send the response
		PrintWriter out = response.getWriter();
		// Setting the responseText

		String responseText = "<h1 style='color:red'>Welcome to Servlets</h1>";
		// Sending the response
		out.println(responseText);
	}

}
