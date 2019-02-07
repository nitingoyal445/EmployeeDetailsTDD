package com.Employee.Beans;

public class Country {

	private String name;
	City city;
	@Override
	public String toString() {
		return "Country [name=" + name + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
