/**
 * 
 */
package com.sachin.crud.crud.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
public Employee() {}
public Employee(Long id, String name, String salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
@Column
private String name;
@Column
private String salary;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}

}
