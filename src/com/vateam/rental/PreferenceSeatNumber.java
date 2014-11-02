package com.vateam.rental;


public class PreferenceSeatNumber extends Preference {

	private Vehicle vehicle;
	private int seatNumber;
	
	public PreferenceSeatNumber(Vehicle vehicle, int seatNumber) {
		this.vehicle = vehicle;
		this.seatNumber = seatNumber;
	}
	
	@Override
	boolean check() {	
		return vehicle.getSeatNumber() == seatNumber;
	}
	
}