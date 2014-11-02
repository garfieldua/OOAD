package com.vateam.rental;

public abstract class RentalVehicle extends Rental {
	private Department pickUpLocation;
	private Vehicle rentedVehicle;
	
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
}
