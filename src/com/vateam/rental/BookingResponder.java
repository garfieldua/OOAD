package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


// at first, the person is GUEST
// we have no info about him or her
// so we need to get it.

// this call is meant to do the communication
// between booker and the booking service

//methods to receive info about vehicles
// methods to receive info about person
// methods to send info about vehicle (is available, etc)



public class BookingResponder {
	
	
	// check if there's a vehicle for given location and preferences
	public Vehicle getAvailableVehicle(ArrayList<Preference> prefs, Department pickUpLocation, boolean isWeakCheck ) {
		// here we need to get all vehicle :)
		ArrayList<Vehicle> v_all = GlobalManager.getInstance().getAllVehicles();
		
		// filter by given department
		ArrayList<Vehicle> v_filtered_department = new ArrayList<Vehicle>();
		
		for (Vehicle v : v_all) {
			if (v.getCurDepartament().equals(pickUpLocation) ) {
				v_filtered_department.add(v);
			}
		}
		
		// filter by availablity
		ArrayList<Vehicle> v_filtered_availability = new ArrayList<Vehicle>();
		
		for (Vehicle v : v_filtered_department) {
			if (v.isAvailable()) {
				v_filtered_availability.add(v);
			}
		}
		
		// filter by preferences
		ArrayList<Vehicle> v_filtered_prefs = new ArrayList<Vehicle>();
		
		// get wanted preferences
		//ArrayList<Preference> prefs = booking.getPreferences();
		
		for (Vehicle v : v_filtered_availability) {
			boolean flag = true;
			for (Preference pref : prefs) {
				if (isWeakCheck && (pref instanceof WeakPreference)) {
					WeakPreference weakpref = (WeakPreference) pref;
					if (!weakpref.checkVehicleByWeakPref(v)) {
						flag = false;
					}
				} else {
					if (!pref.checkVehicleByPref(v)) {
						flag = false;
					}
				}
			}
					
			//add if all prefs are ok
			if (flag) {
				v_filtered_prefs.add(v);
			}
		}
		
		// if result is empty -> bye bye, no vehicle :)
		//boolean b = (v_filtered_prefs.size() != 0);
		//return b;
		if (v_filtered_prefs.size() != 0)
		{
			return v_filtered_prefs.get(0);
		}
		else
		{
			return null;
		}
	}
	
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
			booking.setBookingCustomer(customer);
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