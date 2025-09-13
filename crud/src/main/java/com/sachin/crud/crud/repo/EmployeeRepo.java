/**
 * 
 */
package com.sachin.crud.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachin.crud.crud.dto.Employee;

/**
 * 
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
