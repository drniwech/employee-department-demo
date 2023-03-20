package com.inoptra.employeedepartmentdemo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Represents Employee entity
 **/
@Entity
@Getter
@Setter
//TODO: Using @Builder but need to do some workaround to make JPA happy.
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	protected Employee(){};

	public Employee(String name){
		this.name = name;
	}

	@OneToOne(cascade = CascadeType.MERGE, orphanRemoval = true)
	@JoinColumn(name = "salary_id", referencedColumnName = "id")
	private Salary salary;

	@ManyToOne
	@JsonBackReference
	private Department department;

}
