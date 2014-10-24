package com.vateam.rental;

public class PreferenceSeatNumber implements Preference, WeakPreference {

	private int seatNumber;
	
	public PreferenceSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	@Override
	public boolean checkVehicleByPref(Vehicle v) {
		return (v.getSeatNumber() == this.seatNumber);
	}

	@Override
	public boolean checkVehicleByWeakPref(Vehicle v) {
		return (Math.abs(v.getSeatNumber() - this.seatNumber) <= 1);
	}
	
}
