package com.controller;

public class EmployeeCompute 
{
	
	private int id;
    private String name;
    private String email;
    private String contact;
    private String city;
    private double salaryPerMonth;
    
    
	@Override
	public String toString() {
		return "EmployeeCompute [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", city="
				+ city + ", salaryPerMonth=" + salaryPerMonth + "]";
	}
	public EmployeeCompute() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeCompute(int id, String name, String email, String contact, String city, double salaryPerMonth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.city = city;
		this.salaryPerMonth = salaryPerMonth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}
	public void setSalaryPerMonth(double salaryPerMonth) {
		this.salaryPerMonth = salaryPerMonth;
	}
	



}