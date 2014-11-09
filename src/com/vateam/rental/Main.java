package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// here we create 'booking' based on given info
		BookingController bs = new BookingController();
		
		int pickupDepartmentId = 3;
		int dropOffDepartmentId = 4;
		Date startDate = new Date(2014,11,06);
		Date endDate = new Date(2014,11,06);
		
		PreferenceVehicle pac = new PreferenceAirConditioner();
		PreferenceVehicle psn = new PreferenceSeatNumber(5);

		ArrayList<PreferenceVehicle> prefs = new ArrayList<PreferenceVehicle>();
		prefs.add(pac);
		prefs.add(psn);
		
		PersonInfo pi = new PersonInfo();
		pi.setFirstName("Vovan");
		Customer c = new Customer();
		c.setCustomerInfo(pi);
		
		bs.createBooking(c,pickupDepartmentId, dropOffDepartmentId, startDate, endDate, prefs);
		
		//after some time
		//we need to get a vehicle for given booking
		boolean vehicle_found = bs.isVehicleAvailable();
		if (vehicle_found) {
			System.out.println("Vehicle is available");
		} 
		else {
			System.out.println("Vehicle is not available");
		}
		
		//after some time
		//creating rental by booking
		RentalController rc = new RentalController();
		rc.createRentalByBooking(bs.getBooking());
		
		//another use-case: creating rental 'buy-it-now'
		RentalController rc2 = new RentalController();
		rc2.createRentalBuyItNow(c, endDate);
		
		//after some time
		//return of a car
		rc.doReturn();
		rc2.doReturn();
	}

}
