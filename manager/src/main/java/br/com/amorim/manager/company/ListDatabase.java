package br.com.amorim.manager.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.catalina.connector.Response;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListDatabase
 */
@WebServlet("/company/list")
public class ListDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Company> allCompanies = Database.listCompanies();
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ListCompanies.jsp");
		request.setAttribute("companies", allCompanies);
		requestDispatcher.forward(request, response);
	}

}
