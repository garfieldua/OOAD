package com.vateam.rental;


public class PreferenceSeatNumber extends Preference {

	private int seatNumber;
	
	public PreferenceSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	@Override
	boolean check(Object v) {	
		boolean result = false;
		
		if (v instanceof Car) {
			Car car = (Car) v;
			result = car.getSeatNumber() == seatNumber;
		}

		return result;
	}
}