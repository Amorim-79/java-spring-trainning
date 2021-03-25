package br.com.amorim.manager.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    	String initialDateCompany = req.getParameter("initialDateCompany");
    	
    	Date initialDateCompanyFormatted = null;
		try {
			initialDateCompanyFormatted = new SimpleDateFormat("yyyy-MM-dd").parse(initialDateCompany);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		
    	Database database = new Database();
    	Company company = new Company(companyName, initialDateCompanyFormatted);    	
   		
    	database.addCompanies(company);
    	
    	resp.sendRedirect("/manager/company/list");
   	}

}
