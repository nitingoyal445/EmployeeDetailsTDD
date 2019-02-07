package com.Employee.Beans;

public class Address {

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", country=" + country + "]";
	}
	private String addressLine;
	Country country;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
}
