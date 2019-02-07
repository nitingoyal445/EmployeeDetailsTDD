package com.Employee.BusinessLogic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Employee.Beans.*;
import com.Employee.Exceptions.AddressLineNullException;
import com.Employee.Exceptions.CanNotBeEmptyException;
import com.Employee.Exceptions.IdAlreadyException;
import com.Employee.Exceptions.IdNullException;
import com.Employee.Exceptions.NameDoesNotExistException;
import com.Employee.Exceptions.NameNullException;
import com.Employee.repo.EmployeeRepo;

import java.util.List;;
public class EmployeeServicesImpl implements EmployeeServices{
	
	EmployeeRepo employeeRepo;
	/**
	 * @param employeeRepo
	 */
	public EmployeeServicesImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	
	@Override
	public Employee createEmployee(int id,String name, Address address) throws IdNullException,NameNullException,CanNotBeEmptyException,IdAlreadyException, AddressLineNullException{
		if(id<=0) {
			throw new IdNullException();
		}
		if(name==null) {
			throw new NameNullException();
		}
		if(address==null) {
			throw new CanNotBeEmptyException();
		}
		if(employeeRepo.findById(id)) {
			throw new IdAlreadyException();
		}
		if(address.getAddressLine()==null) {
			throw new AddressLineNullException();
		}
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setAddress(address);
		employeeRepo.save(employee);
		return employee;
	}
@Override
	public List<Employee> searchByName(String name) throws NameNullException,NameDoesNotExistException {
		
		if(name=="") {
			throw new NameNullException();
		}
		
		List<Employee> list=employeeRepo.findByName(name);
		if(list.size()==0) {
			throw new NameDoesNotExistException();
		}
		return list;
	}}
