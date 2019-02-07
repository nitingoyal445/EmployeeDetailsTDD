package com.Employee.repo;

import java.util.List;

import com.Employee.Beans.Employee;

public interface EmployeeRepo {

	Employee save(Employee employee);
	List<Employee> findByName(String name);
	Boolean findById(int id);
}
