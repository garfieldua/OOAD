package com.vateam.rental;

public class Car extends Vehicle {
	private String licensePlate;
	private boolean hasAirConditioner;
	

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public boolean hasAirConditioner() {
		return hasAirConditioner;
	}

	public void setHasAirConditioner(boolean hasAirConditioner) {
		this.hasAirConditioner = hasAirConditioner;
	}
}
