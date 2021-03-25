package br.com.amorim.manager.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {
	private static List<Company> companies = new ArrayList<Company>();
	
	public void addCompanies(Company company) {
		company.setId(companies.size() + 1);
		Database.companies.add(company);
	}
	
	public void deleteCompanies(int id) {
		Iterator<Company> iterator = companies.iterator();
		
		while (iterator.hasNext()) {
			Company company = iterator.next();
			if (company.getId() == id) {
				iterator.remove();
			}
		}
	}
	
	public Company getCompanyById(int id) {
		for (Company company: companies) { 
	        if(company.getId() == id)  {
	            return company;
	        }

	    }
		return null;
		
	}
	
	public void updateCompany(Company companyUpdated) {
		for (Company company: companies) { 
	        if(company.getId() == companyUpdated.getId()) {
	            company.setName(companyUpdated.getName());
	            company.setInitialDate(companyUpdated.getInitialDate());
	        }

	    }	
	}
	
	public static List<Company> listCompanies() {
		return Database.companies;
	}
}
