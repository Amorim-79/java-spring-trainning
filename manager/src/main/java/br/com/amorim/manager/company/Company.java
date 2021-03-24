package br.com.amorim.manager.company;

import java.util.Date;

public class Company {
	private int id;
	private String name;
	private Date initialDate;
	
	public Company(int id, String name, Date initialDate){
		this.id = id;
		this.name = name;
		this.initialDate = initialDate;
	}
	
	public Company(String name, Date initialDate){
		this.name = name;
		this.initialDate = initialDate;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getInitialDate() {
		return this.initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	
	
}
