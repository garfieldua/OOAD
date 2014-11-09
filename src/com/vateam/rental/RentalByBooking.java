package com.vateam.rental;

public class RentalByBooking extends RentalVehicle {

	private Department pickUpLocation;
	
	public Department getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(Department pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	
	//create rental by booking
	public RentalByBooking(Booking b) {
		this.setCustomer(b.getBookingCustomer());
		this.setPickUpLocation(b.getPickUpLocation());
		//and so on
	}
	
}
