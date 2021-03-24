package br.com.amorim.manager.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.catalina.connector.Response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListDatabase
 */
@WebServlet("/ListDatabase")
public class ListDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Company> allCompanies = Database.listCompanies();
		
		PrintWriter out = response.getWriter();
		out.println("<html> <body>");
		out.println("<ul>");
		for (Company company : allCompanies) {
			out.println("<li>" + company.getName() + "</li>");		
		}
		out.println("</ul>");
		out.println("</body> </html>");
	}

}
