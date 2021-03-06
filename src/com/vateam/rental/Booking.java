package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;

public class Booking {

	private Integer id;
	private String status;
	private Date regDate;
	private DateRange bookingRange;
	private Customer bookingCustomer;
	private Department pickUpLocation;
	private Department dropOffLocation;
	private Vehicle bookedVehicle;
	private ArrayList<Preference> prefs = new ArrayList<Preference>();
	
	public void addPref(Preference pref) {
		prefs.add(pref);
	}
	
	public ArrayList<Preference>  getPrefs() {
		return new ArrayList<Preference> (prefs);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public DateRange getBookingRange() {
		return bookingRange;
	}

	public void setBookingRange(DateRange bookingRange) {
		this.bookingRange = bookingRange;
	}

	public Vehicle getBookedVehicle() {
		return bookedVehicle;
	}

	public void setBookedVehicle(Vehicle bookedVehicle) {
		this.bookedVehicle = bookedVehicle;
	}

	public Customer getBookingCustomer() {
		return bookingCustomer;
	}

	public void setBookingCustomer(Customer bookingCustomer) {
		this.bookingCustomer = bookingCustomer;
	}

	public Department getPickUpLocation() {
		return pickUpLocation;
	}

	public void setPickUpLocation(Department pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Department getDropOffLocation() {
		return dropOffLocation;
	}

	public void setDropOffLocation(Department dropOffLocation) {
		this.dropOffLocation = dropOffLocation;
	}

	public boolean isVehicleAvailable(VehiclePicker vp) {
		
		// strategy
		Vehicle v = vp.getAvailableVehicle(this);
		this.setBookedVehicle(v);
		
		return (v!=null);
	}
}
