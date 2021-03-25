package br.com.amorim.manager.company;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditCompany
 */
@WebServlet("/company/edit")
public class EditCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String companyName = request.getParameter("companyName");
    	String initialDateCompany = request.getParameter("initialDateCompany");
    	int id = Integer.parseInt(request.getParameter("id"));
    	
    	Date initialDateCompanyFormatted = null;
		try {
			initialDateCompanyFormatted = new SimpleDateFormat("yyyy-MM-dd").parse(initialDateCompany);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		
    	Database database = new Database();
    	Company company = new Company(id, companyName, initialDateCompanyFormatted); 
    	database.updateCompany(company);
		
		response.sendRedirect("/manager/company/list");
	}

}
