package com.Employee.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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

public class EmployeeServiceImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void WhenEnteredDetailOfEmployeeIsCorrectAndEmployeeIsCreatedSuccessfully() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, AddressLineNullException {
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
		
	}
	@Test(expected=com.Employee.Exceptions.IdNullException.class)
	public void WhenIdEnteredIsNull() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, AddressLineNullException {
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
		
		esi.createEmployee(0, "nitin", a);
	}
	@Test(expected=com.Employee.Exceptions.NameNullException.class)
	public void WhenNameEnteredIsNullWhenCreatingEmployee() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, AddressLineNullException {
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
		
		esi.createEmployee(2,null, a);
	}
	@Test(expected=com.Employee.Exceptions.CanNotBeEmptyException.class)
	public void WhenAddressEnteredIsNullWhenCreatingEmployee() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, AddressLineNullException {
		EmployeeRepoImpl eri=new EmployeeRepoImpl();
		EmployeeServicesImpl esi=new EmployeeServicesImpl(eri);
		City c=new City();
		c.setName("Delhi");
		Country co=new Country();
		co.setName("India");
		co.setCity(c);
		Address a=null;
		
		esi.createEmployee(2, "nitin", a);
	}
	@Test(expected=com.Employee.Exceptions.AddressLineNullException.class)
	public void WhenAddressLineEnteredIsNullAlreadyExistWhenCreatingEmployee() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, AddressLineNullException {
		EmployeeRepoImpl eri=new EmployeeRepoImpl();
		EmployeeServicesImpl esi=new EmployeeServicesImpl(eri);
		City c=new City();
		c.setName("Delhi");
		Country co=new Country();
		co.setName("India");
		co.setCity(c);
		Address a=new Address();
		a.setAddressLine(null);
		a.setCountry(co);
		
		esi.createEmployee(2, "nitin", a);
		
	}
	@Test(expected=com.Employee.Exceptions.IdAlreadyException.class)
	public void WhenIdEnteredIsAlreadyExistWhenCreatingEmployee() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, AddressLineNullException {
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
		
		esi.createEmployee(2, "nitin", a);
		esi.createEmployee(2, "nitin1", a);
	}
	
	@Test
	public void WhenNameEnteredForSearchIsCorrectWhenSeachByName() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, NameDoesNotExistException, AddressLineNullException {
		
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
		
		esi.createEmployee(2, "nitin", a);
		System.out.println(esi.searchByName("nitin"));
	}
	@Test(expected=com.Employee.Exceptions.NameNullException.class)
	public void WhenNameEnteredIsNullWhileSeachByName() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, NameDoesNotExistException, AddressLineNullException {
		
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
		
		esi.createEmployee(2, "nitin", a);
		System.out.println(esi.searchByName(""));
	}
	@Test(expected=com.Employee.Exceptions.NameDoesNotExistException.class)
	public void WhenNameEnteredIsNotExistWhileSeachByName() throws IdNullException, NameNullException, CanNotBeEmptyException, IdAlreadyException, NameDoesNotExistException, AddressLineNullException {
		
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
		
		esi.createEmployee(2, "nitin", a);
		System.out.println(esi.searchByName("rajat"));
	}

}
