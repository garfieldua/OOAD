package com.vateam.rental;

public class Car extends Vehicle {
	// that is concrete car!
	private String licensePlate;
	

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
}
