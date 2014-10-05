package com.vateam.rental;

public class Customer {
	
	private Location customerLocation;
	private PersonInfo customerInfo;
	private String drivingLicenseNumber;
	
	public Location getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(Location customerLocation) {
		this.customerLocation = customerLocation;
	}
	public PersonInfo getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(PersonInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	
}
