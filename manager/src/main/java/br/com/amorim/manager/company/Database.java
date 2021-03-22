package br.com.amorim.manager.company;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static List companies = new ArrayList<Company>();
	
	public void addCompanies(Company company) {
		Database.companies.add(company);
	}
	
	public static List<Company> listCompanies() {
		return Database.companies;
	}
}
