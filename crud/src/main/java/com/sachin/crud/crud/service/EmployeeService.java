package com.sachin.crud.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.crud.crud.dto.Employee;
import com.sachin.crud.crud.repo.EmployeeRepo;
@Service
public class EmployeeService {
@Autowired
private EmployeeRepo employee;

public List<com.sachin.crud.crud.dto.Employee> getEmployeeList(){
	
	return employee.findAll();
	
}

public Employee saveEmployee(Employee emp) {
	return employee.save(emp);
}

public Employee getEmployee(Long id) {
	return employee.getOne(id);
}

public void deleteEmployee(Long id) {
	employee.deleteById(id);
	System.out.printf("delete successful");
}

public Employee updateEmployee(Employee emp) 
{
	return employee.save(emp);
}
}
