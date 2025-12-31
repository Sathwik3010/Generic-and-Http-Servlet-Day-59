package com.codegnan.web;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

/**
 * Servlet implementation class GenericServlet_01
 */
@WebServlet("/Generic")
public class GenericServlet_01 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		LocalTime time = LocalTime.now();
		int hour=time.getHour();
		String wishMessage="";
		if(hour<12) {
			wishMessage="Good Morning";
		} else {
			if(hour>=12 && hour<=17) {
				wishMessage="Good Afternoon";
			} else {
				wishMessage="Good Evening";
			}
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:aqua' align='center'>");
		out.println("Hello Dev "+wishMessage);
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");

	}

}
