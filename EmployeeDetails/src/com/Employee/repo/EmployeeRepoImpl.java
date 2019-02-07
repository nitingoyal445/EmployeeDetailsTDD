package com.Employee.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Employee.Beans.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	Employee employee;
	HashMap<Integer,Employee> map=new HashMap<>();
	
	@Override
	public Employee save(Employee employee) {
		map.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> list=new ArrayList<>();
		map.forEach((m,n)->{
		if(name==n.getName())
			list.add(n);
		});
		return list;
		}

	@Override
	public Boolean findById(int id) {
		if(map.containsKey(id))
			return true;
		return false;
	}
}
