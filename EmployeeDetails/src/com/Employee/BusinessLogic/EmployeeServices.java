package com.Employee.BusinessLogic;

import java.util.List;
import com.Employee.Beans.Address;
import com.Employee.Beans.Employee;
import com.Employee.Exceptions.AddressLineNullException;
import com.Employee.Exceptions.CanNotBeEmptyException;
import com.Employee.Exceptions.IdAlreadyException;
import com.Employee.Exceptions.IdNullException;
import com.Employee.Exceptions.NameDoesNotExistException;
import com.Employee.Exceptions.NameNullException;

public interface EmployeeServices {
	
	Employee createEmployee(int id,String name,Address address) throws IdAlreadyException,NameNullException,IdNullException,CanNotBeEmptyException, AddressLineNullException;
	List<Employee> searchByName(String name) throws NameDoesNotExistException,NameNullException;
	}
