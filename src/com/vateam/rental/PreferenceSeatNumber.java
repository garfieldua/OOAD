package com.vateam.rental;


public class PreferenceSeatNumber extends Preference {

	private Car car;
	private int seatNumber;
	
	public PreferenceSeatNumber(Car car, int seatNumber) {
		this.car = car;
		this.seatNumber = seatNumber;
	}
	
	@Override
	boolean check() {	
		return car.getSeatNumber() == seatNumber;
	}
	
}