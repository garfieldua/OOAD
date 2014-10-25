package com.vateam.rental;

import java.util.ArrayList;

public class Manager {
	
	private PersonInfo maganerInfo;

	public PersonInfo getMaganerInfo() {
		return maganerInfo;
	}

	public void setMaganerInfo(PersonInfo maganerInfo) {
		this.maganerInfo = maganerInfo;
	}

	public void inspectRentedVehicle(Rental r) {
		ArrayList<ConditionChecker> terms = r.getReturnTerms();
		
		for (ConditionChecker term: terms) {
			term.checkVehicleByCond(r.getRentedVehicle());
		}
		
		// do something after checking
	}
}

