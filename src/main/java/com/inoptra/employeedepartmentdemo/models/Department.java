package com.inoptra.employeedepartmentdemo.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Represents {@code Department} entity
 **/
@Entity
@Getter
@Setter
public class Department {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@OneToMany(mappedBy = "department", fetch = FetchType.EAGER, //TODO: fix JSON failed to lazily init a collection.
	cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Employee> employees;

	public void addEmployee(Employee employee){
		employees.add(employee);
		employee.setDepartment(this);
	}

	public void removeEmployee(Employee employee){
		employees.remove(employee);
		employee.setDepartment(null);
	}

}
