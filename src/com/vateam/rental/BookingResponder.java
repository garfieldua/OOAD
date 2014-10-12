package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;

// at first, the person is GUEST
// we have no info about him or her
// so we need to get it.

// this call is meant to do the communication
// between booker and the booking service

//methods to receive info about vehicles
// methods to receive info about person
// methods to send info about vehicle (is available, etc)



public class BookingResponder {
	
	//return all cars of the firm
	public ArrayList<Vehicle> getAllVehicles() {
		return null;
	}
	
	// get all cars by given category
	public ArrayList<Vehicle> getVehiclesByCategory(String category) {
		return null;
	}
	
	// we got all the info. we need to validate it
	public void receiveBookingInfo(Vehicle v, Location l, DateRange r, PersonInfo p, String drivingLicenseNumber) {
		if (this.isBookingInfoValid(v, l, r, p,drivingLicenseNumber)) {
			// something good
			this.sendInfoIsValid();
			
			// now we can create booking
			
			// get available manager for booking process
			Manager m = this.getManager(l);
			
			// get available id
			Integer id = this.getAvailableBookingId();
			
			// create customer
			Customer customer = new Customer();
			customer.setCustomerInfo(p);
			customer.setDrivingLicenseNumber(drivingLicenseNumber);
			
			// create booking
			Booking booking = new Booking();
			booking.setBookedVehicle(v);
			booking.setBookingCustomer(customer);
			booking.setBookingManager(m);
			booking.setBookingRange(r);
			booking.setId(id);
			booking.setRegDate(new Date());
		}
		else {
			// something bad
			ArrayList<String> errors = this.getInfoValidErrors(v, l, r, p, drivingLicenseNumber);
			this.sendGivenInvalidInfo(errors);
		}
	}
	
	private Boolean isBookingInfoValid(Vehicle v, Location l, DateRange r, PersonInfo p, String drivingLicenseNumber) {
		return true;
	}
	
	private ArrayList<String> getInfoValidErrors(Vehicle v, Location l, DateRange r, PersonInfo p, String drivingLicenseNumber) {
		return null;
	}
	
	private void sendGivenInvalidInfo( ArrayList<String> errors ) {
		// sending info about errors to the user
	}
	
	private void sendInfoIsValid() {
		// tell the user that his info is ok
	}
	
	//getting available manager for the booking
	private Manager getManager(Location l) {
		return null;
	}
	
	private Integer getAvailableBookingId() {
		return 0;
	}
	
}

//TODO: add CarBookingResponder (MotorbikeBookingResponder), extending BookingResponder
//TODO: Create database to store info about car
//TODO: best way to implement categories for vehicles (different ones for car + moto)