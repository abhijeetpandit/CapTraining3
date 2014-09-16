package org.abhi.beans;

public class Customer {
	private String name;
	private String lastName;
	private Address address;
	
	public Customer() {
	}
	
	public Customer(String name, String lastName, Address city) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.address = city;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
}
