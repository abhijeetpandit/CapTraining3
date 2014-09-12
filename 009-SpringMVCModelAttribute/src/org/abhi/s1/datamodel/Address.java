package org.abhi.s1.datamodel;

public class Address {
	private Integer pin;
	private String area;
	private String city;
	private String state;
	private String Country;
	
	
	
	public Address() {
	}
	
	
	
	public Address(Integer pin, String area, String city, String state,
			String country) {
		this.pin = pin;
		this.area = area;
		this.city = city;
		this.state = state;
		Country = country;
	}



	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", Country=" + Country + "]";
	}
}
