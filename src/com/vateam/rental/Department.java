package com.vateam.rental;

import java.util.ArrayList;

public class Department {
	
	private Location departmentLocation;
	private String phoneNumber;
	private String emailAddress;
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	ArrayList<Manager> managerList = new ArrayList<Manager>();
	
	public Location getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(Location departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}
	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	public ArrayList<Manager> getManagerList() {
		return managerList;
	}
	public void setManagerList(ArrayList<Manager> managerList) {
		this.managerList = managerList;
	}
	
}
