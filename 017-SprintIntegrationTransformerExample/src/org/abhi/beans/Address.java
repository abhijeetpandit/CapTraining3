package org.abhi.beans;

public class Address {
	private String area;
	private String street;
	private String city;
	private String Country;
	
	public Address() {
	}
	public Address(String area, String street, String city, String country) {
		this.area = area;
		this.street = street;
		this.city = city;
		Country = country;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
}
