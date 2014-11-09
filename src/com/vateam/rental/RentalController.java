package com.vateam.rental;

import java.util.Date;

public class RentalController {
	private Rental rental = null;
	
	public void createRentalByBooking(Booking booking) {
		rental = new RentalByBooking(booking);
		rental.setManager(getAvailableManager());
	}
	
	public void createRentalBuyItNow(Customer c, Date returnDate) {
		rental = new RentalBuyItNow(c, returnDate);
		rental.setManager(getAvailableManager());
	}

	public Rental getRental() {
		return rental;
	}
	
	private Manager getAvailableManager() {
		// temp 
		PersonInfo pf = new PersonInfo();
		pf.setFirstName("Mr. Shalinsky");
		Manager m = new Manager();
		m.setMaganerInfo(pf);
		
		return m;
	}
	
	public void doReturn() {
		Manager manager = rental.getManager();
		manager.inspectRentedVehicle(rental);
	}
	
}
