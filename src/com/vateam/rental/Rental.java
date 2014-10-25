package com.vateam.rental;

import java.util.ArrayList;

public abstract class Rental {
	private Integer id;
	private String status;
	private DateRange rentalRange;
	private Customer customer;
	private Department pickUpLocation;
	private Vehicle rentedVehicle;
	private Manager manager;
	
	// terms of vehicle return
	private ArrayList<ConditionChecker> returnTerms = new ArrayList<ConditionChecker>();
	
	public void addReturnTerm(ConditionChecker pref) {
		returnTerms.add(pref);
	}
	
	public ArrayList<ConditionChecker> getReturnTerms() {
		return new ArrayList<ConditionChecker>(returnTerms);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DateRange getRentalRange() {
		return rentalRange;
	}
	public void setRentalRange(DateRange rentalRange) {
		this.rentalRange = rentalRange;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Department getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(Department pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	public Vehicle getRentedVehicle() {
		return rentedVehicle;
	}
	public void setRentedVehicle(Vehicle rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
}
