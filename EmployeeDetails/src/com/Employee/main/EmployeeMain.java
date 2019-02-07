package com.Employee.main;

import com.Employee.Beans.Address;
import com.Employee.Beans.City;
import com.Employee.Beans.Country;
import com.Employee.BusinessLogic.EmployeeServicesImpl;
import com.Employee.Exceptions.AddressLineNullException;
import com.Employee.Exceptions.CanNotBeEmptyException;
import com.Employee.Exceptions.IdAlreadyException;
import com.Employee.Exceptions.IdNullException;
import com.Employee.Exceptions.NameDoesNotExistException;
import com.Employee.Exceptions.NameNullException;
import com.Employee.repo.EmployeeRepoImpl;

public class EmployeeMain {

	public static void main(String[] args) throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, NameDoesNotExistException, AddressLineNullException {
		EmployeeRepoImpl eri=new EmployeeRepoImpl();
		EmployeeServicesImpl esi=new EmployeeServicesImpl(eri);
		City c=new City();
		c.setName("Delhi");
		Country co=new Country();
		co.setName("India");
		co.setCity(c);
		Address a=new Address();
		a.setAddressLine("Pahar Ganj");
		a.setCountry(co);
		
		esi.createEmployee(201, "nitin", a);
		esi.createEmployee(201, "nitin1", a);
		System.out.println(esi.searchByName("rajat"));

	}

}
