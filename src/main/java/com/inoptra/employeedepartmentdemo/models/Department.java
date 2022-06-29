package com.inoptra.employeedepartmentdemo.models;

import java.util.List;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Represents {@code Department} entity
 **/
public class Department {

    private Long id;

    private String name;

    private List<Employee> employees;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
    
    
}
