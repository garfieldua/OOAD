package com.vateam.rental;

public abstract class PreferenceVehicle extends Preference {
	protected Vehicle v;
	
	public void setVehicleToCheck(Vehicle v) {
		this.v = v;
	}
}
