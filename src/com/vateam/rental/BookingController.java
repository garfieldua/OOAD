package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;

public class BookingController {
	
	private Booking booking = null;
	
	public void createBooking(Customer c, int pickupDepartmentId, int dropOffDepartmentId, Date startDate, Date endDate, ArrayList<PreferenceVehicle> prefs) {
		booking = new Booking();
		
		// some id to generate
		int id = 0;
		booking.setId(id);
		
		// reg date should be NOW
		booking.setRegDate(new Date());
		
		// set date range 
		DateRange dateRange = new DateRange();
		dateRange.setStarts(startDate);
		dateRange.setEnds(endDate);
		
		booking.setBookingRange(dateRange);
		
		// locs
		Department pickupLoc = new Department();
		pickupLoc.setId(pickupDepartmentId);
		booking.setPickUpLocation(pickupLoc);
		
		Department dropOffLoc = new Department();
		dropOffLoc.setId(dropOffDepartmentId);
		booking.setDropOffLocation(dropOffLoc);
		
		//prefs
		for (PreferenceVehicle pref: prefs) {
			booking.addPref(pref);
		}
		
		// customer
		booking.setBookingCustomer(c);
	}
	
	public boolean isVehicleAvailable() {
		GlobalManager gm = GlobalManager.getInstance();
		
		ArrayList<Vehicle> vehicles = gm.getAllVehicles();
		ArrayList<PreferenceVehicle> prefs = booking.getPrefs();
		ArrayList<Vehicle> available_vehicles = new ArrayList<Vehicle>();
		
		for (Vehicle v: vehicles) {
			if (v.getCurDepartament().equals(booking.getPickUpLocation())) {
				boolean ok = true;
				for (PreferenceVehicle pref: prefs) {
					pref.setVehicleToCheck(v);
					if (!pref.check()) {
						ok = false;
					}
				}
				
				if (ok) {
					available_vehicles.add(v);
				}
			}
		}
		
		if (available_vehicles.size() != 0) {
			booking.setBookedVehicle(available_vehicles.get(0));
			return true;
		}
		else {
			// do weak check here
			// some magic logic here needed
		}
		
		return true;
	}
	

	public Booking getBooking() {
		return booking;
	}

}