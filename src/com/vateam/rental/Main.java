package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// here we create 'booking' based on given info
		BookingController bs = new BookingController();
		
		int pickupDepartmentId = 15;
		int dropOffDepartmentId = 4;
		Date startDate = new Date(2014,11,06);
		Date endDate = new Date(2014,11,06);
		
		Preference pac = new PreferenceAirConditioner();
		Preference psn = new PreferenceSeatNumber(4);

		ArrayList<Preference> prefs = new ArrayList<Preference>();
		prefs.add(pac);
		prefs.add(psn);
		
		PersonInfo pi = new PersonInfo();
		pi.setFirstName("Vovan");
		Customer c = new Customer();
		c.setCustomerInfo(pi);
		
		Booking booking = bs.createBooking(c,pickupDepartmentId, dropOffDepartmentId, startDate, endDate, prefs);
		
		//after some time
		//we need to get a vehicle for given booking
		boolean vehicle_found = booking.isVehicleAvailable(new VehiclePickerStrict());
		if (vehicle_found) {
			System.out.println("Vehicle is available");
		} 
		else {
			System.out.println("Vehicle is not available");
		}
		
		//after some time
		RentalController rc = new RentalController();
		
		//creating rental by booking
		Rental rental1 = rc.createRentalByBooking(booking);
		
		//another use-case: creating rental 'buy-it-now'
		Rental rental2 = rc.createRentalBuyItNow(c, endDate);
		
		//after some time
		//return of a car
		rc.doReturn(rental1);
		rc.doReturn(rental2);
	}

}
