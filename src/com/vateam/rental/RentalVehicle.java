package com.vateam.rental;

public abstract class RentalVehicle extends Rental {
	private Vehicle rentedVehicle;
	
	public Vehicle getRentedVehicle() {
		return rentedVehicle;
	}
	public void setRentedVehicle(Vehicle rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}
}
