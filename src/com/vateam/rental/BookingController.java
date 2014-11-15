package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;

public class BookingController {
	// singleton
	private static BookingController _obj;
	
	private BookingController() {
		
	}
	
	public static BookingController getInstance() {
        if (_obj == null) {
        	_obj = new BookingController();
        }
        
        return _obj;
    }
	
	public Booking createBooking(Customer c, int pickupDepartmentId, int dropOffDepartmentId, Date startDate, Date endDate, ArrayList<Preference> prefs) {
		Booking booking = new Booking();
		
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
		for (Preference pref: prefs) {
			booking.addPref(pref);
		}
		
		// customer
		booking.setBookingCustomer(c);
		return booking;
	}
	
}