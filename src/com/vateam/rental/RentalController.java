package com.vateam.rental;

import java.util.Date;

public class RentalController {
		
	public Rental createRentalByBooking(Booking booking) {
		Rental rental = new RentalByBooking(booking);
		rental.setManager(getAvailableManager(rental));
		return rental;
	}
	
	public Rental createRentalBuyItNow(Customer c, Date returnDate) {
		Rental rental = new RentalBuyItNow(c, returnDate);
		rental.setManager(getAvailableManager(rental));
		return rental;
	}
	
	private Manager getAvailableManager(Rental rental) {
		// simulation
		PersonInfo pf = new PersonInfo();
		pf.setFirstName("Mr. Shalinsky");
		Manager m = new Manager();
		m.setMaganerInfo(pf);
		
		return m;
	}
	
	public void doReturn(Rental rental) {
		Manager manager = rental.getManager();
		manager.inspectRentedVehicle(rental);
	}
	
}
