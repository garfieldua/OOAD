package com.vateam.rental;

public class ConditionCheckerOdometer implements ConditionChecker {

	private int mileage;
	
	public ConditionCheckerOdometer(int mileage) {
		this.mileage = mileage;
	}
	
	@Override
	public boolean checkVehicleByCond(Vehicle v) {
		// magic here
		return true;
	}
	
}
