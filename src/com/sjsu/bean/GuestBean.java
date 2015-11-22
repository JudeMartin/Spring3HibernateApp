package com.sjsu.bean;

public class GuestBean {
	
	private Integer guest_id;
	private String first_name;
	private String last_name;
	private String address;
	private String email;
	private String phone;
	private String city;
	private String country;
	private String driver_license;
	
	public Integer getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(Integer guest_id) {
		this.guest_id = guest_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDriver_license() {
		return driver_license;
	}
	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
}



/**
//
//
`guest_id` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(105) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `driver_license` varchar(45) DEFAULT NULL,

**/