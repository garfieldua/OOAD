package com.vateam.rental;


public class PreferenceAirConditioner extends PreferenceVehicle {

	private boolean wantAirConditioner;
	
	public PreferenceAirConditioner(boolean wantAirConditioner) {
		this.wantAirConditioner = wantAirConditioner;
	}
	
	public PreferenceAirConditioner() {
		this.wantAirConditioner = true;
	}
	
	@Override
	boolean check() {
		boolean result = false;
		
		if (v instanceof Car) {
			Car car = (Car) v;
			
			result = car.hasAirConditioner();
			if (!wantAirConditioner) {
				result = !result;
			}
		}

		return result;
	}
	
}
