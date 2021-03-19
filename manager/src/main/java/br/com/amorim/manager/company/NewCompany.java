package br.com.amorim.manager.company;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewCompany
 */
@WebServlet("/company/new")
public class NewCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   		String companyName = req.getParameter("companyName");
    	PrintWriter output = resp.getWriter();
    	output.println("<html>");
   		output.println("<body>");
   		output.println("<p> The " + companyName + " has been created with success!</p>");
    	output.println("</body>");
    	output.println("</html>");
   	}

}
