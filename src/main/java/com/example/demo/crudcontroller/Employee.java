package com.example.demo.crudcontroller;

import lombok.Data;


public class Employee {

	
	
	private int id;
	private int empid;
	private String name;
	private int Salary;
	
	
	public Employee(int id, int empid, String name, int salary) {
		super();
		this.id = id;
		this.empid = empid;
		this.name = name;
		Salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}
	
}
