package com.vateam.rental;

public abstract class Rental {
	private Integer id;
	private String status;
	private DateRange rentalRange;
	private Customer customer;
	private Manager manager;
	
	
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
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
}
