package com.vateam.rental;

public class PreferenceAirConditioner implements Preference {

	boolean wantAirConditioner;
	
	public PreferenceAirConditioner(boolean wantAirConditioner) {
		this.wantAirConditioner = wantAirConditioner;
	}
	
	public PreferenceAirConditioner() {
		this.wantAirConditioner = true;
	}
	
	@Override
	public boolean checkVehicleByPref(Vehicle v) {
		boolean flag = false;
		if (v instanceof Car) {
			Car c = (Car) v;
			flag = ( c.hasAirConditioner() == this.wantAirConditioner );
		}
	
		return flag;
	}
}
