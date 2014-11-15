package com.vateam.rental;

import java.util.ArrayList;

public class VehiclePickerStrict extends VehiclePicker {

	@Override
	public Vehicle getAvailableVehicle(Booking booking) {

		GlobalManager gm = GlobalManager.getInstance();
		
		ArrayList<Vehicle> vehicles = gm.getAllVehicles();
		ArrayList<Preference> prefs = booking.getPrefs();
		ArrayList<Vehicle> available_vehicles = new ArrayList<Vehicle>();
		
		for (Vehicle v: vehicles) {
			if (v.getCurDepartament().equals(booking.getPickUpLocation())) {
				boolean ok = true;
				for (Preference pref: prefs) {
					if (!pref.check(v)) {
						ok = false;
						break;
					}
				}
				
				if (ok) {
					available_vehicles.add(v);
				}
			}
		}
		
		if (available_vehicles.size() != 0) {
			return available_vehicles.get(0);
		}
		else {
			return null;
		}
	
	}

}
