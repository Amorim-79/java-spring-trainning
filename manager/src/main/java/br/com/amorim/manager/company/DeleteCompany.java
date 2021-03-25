package br.com.amorim.manager.company;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteCompany
 */
@WebServlet("/company/delete")
public class DeleteCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idCompany = Integer.parseInt(request.getParameter("id"));
		
		Database database = new Database();
		database.deleteCompanies(idCompany);
		
		response.sendRedirect("/manager/company/list");
	}

}
