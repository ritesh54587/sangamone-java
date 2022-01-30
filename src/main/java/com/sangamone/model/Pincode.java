package com.sangamone.model;

public class Pincode {
	
	private String pincode;
	private String location;
	public Pincode(String pincode, String location) {
		super();
		this.pincode = pincode;
		this.location = location;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
