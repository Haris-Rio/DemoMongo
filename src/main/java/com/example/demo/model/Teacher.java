package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teacher {
	@Id
	private int id;
	private String name;
	private String department;
	private Double salary;
	
	@Override
	public String toString() {
		return "Teacher id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary ;
	}
	
	public Teacher(int id, String name, String department, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	
	
}
