package com.vateam.rental;


public class PreferenceAirConditioner extends Preference {

	private Car car;
	private boolean wantAirConditioner;
	
	public PreferenceAirConditioner(Car car, boolean wantAirConditioner) {
		this.car = car;
		this.wantAirConditioner = wantAirConditioner;
	}
	
	public PreferenceAirConditioner(Car car) {
		this.car = car;
		this.wantAirConditioner = true;
	}
	
	@Override
	boolean check() {
		boolean result = car.hasAirConditioner();
		
		if (!wantAirConditioner) {
			result = !result;
		}
		return result;
	}
	
}
