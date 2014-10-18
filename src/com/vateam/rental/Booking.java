package com.vateam.rental;

import java.util.Date;

public class Booking {

	private Integer id;
	private String status;
	private Date regDate;
	private Manager bookingManager;
	private DateRange bookingRange;
	private Vehicle bookedVehicle;
	private Customer bookingCustomer;
	
	// department -> where we get vehicle
	// department -> where get return vehicle
	
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

	public Manager getBookingManager() {
		return bookingManager;
	}

	public void setBookingManager(Manager bookingManager) {
		this.bookingManager = bookingManager;
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

}
