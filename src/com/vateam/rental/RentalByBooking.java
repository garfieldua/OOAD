package com.vateam.rental;

public class RentalByBooking extends Rental {

	//create rental by booking
	public RentalByBooking(Booking b) {
		this.setCustomer(b.getBookingCustomer());
		this.setPickUpLocation(b.getPickUpLocation());
		//and so on
	}
	
}
