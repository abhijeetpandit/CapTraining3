package org.abhi.beans;

public class Customer {
	private String name;
	private String lastName;
	private String city;
	
	public Customer() {
	}
	
	public Customer(String name, String lastName, String city) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.city = city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", lastName=" + lastName + ", city="
				+ city + "]";
	}
}
