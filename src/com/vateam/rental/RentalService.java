package com.vateam.rental;

import java.util.ArrayList;
import java.util.Date;

public class RentalService {

	//TODO:
	// + What to do with PersonInfo (Customer, Driver, Manager)
	// + Driver - Customer relation
	// + Where to put info about seat number?
	// Rental type problem
	// Insurance
	// + Need to create department with cars and managers in it
	// Extras (gas, extra insurance)
	// Currency?
	
	
	// if we go to moscow from kiev, then, when we arrive, the car MUST be available 
	// at moscow's department. 
	
	// 1. Уподобання змінні з часом
	// 2. Послаблювачі уподобань
	// 3. Поняття оренди (для авто та мото поки що однаково)
	// 4. Операції клієнта протягом оренди (страховий випадок, поліморфність)
	// 5. Повернення транспортного засобу
	
	public static void main(String[] args) {
		// used to communicate
		BookingResponder br = new BookingResponder();
		
		//Preferences prefs = new Preferences();
		//prefs.addPreference(Preference.AIR_CONDITIONER, true);
		//prefs.addPreference(Preference.GEAR_TYPE, "automatic");
		//prefs.addPreference(Preference.SEAT_NUMBER, 4);
		
		Department depart = new Department();
		depart.setId(15);
		
		//check the info?
		
		//create booking
		
		DateRange dateRange = new DateRange();
		dateRange.setStarts(new Date(2014,11,06));
		dateRange.setEnds(new Date(2014,11,11));
		
		Booking booking = new Booking();
		booking.setId(1);
		booking.setRegDate(new Date());
		booking.setBookingRange(dateRange);
		booking.setPickUpLocation(depart);
		booking.setDropOffLocation(depart);
		
		//booking.addPreference(new PreferenceSeatNumber(5));
		//booking.addPreference(new PreferenceAirConditioner());
		
		//ok...
		// after some time (depends on wanted vehicle type) 
		//server side:
		/*
		Vehicle v = br.getAvailableVehicle(booking.getPreferences(), depart, false);
		if (v != null) {
			System.out.println("Vehicle is available");
			System.out.println(v.getModel());
			
			booking.setBookedVehicle(v);
		} 
		else {
			System.out.println("Getting car by weak preferences");
			
			Vehicle v2 = br.getAvailableVehicle(booking.getPreferences(), depart, true);
			if (v2 != null) {
				System.out.println("Vehicle is avialable");
				System.out.println(v2.getModel());
			}
			else {
				System.out.println("Vehicle is not available");
			}
			
		}
		*/
		
		// after some time..
		RentalByBooking rent1 = new RentalByBooking(booking);

		PersonInfo pf = new PersonInfo();
		pf.setFirstName("Mr. Shalinsky");
		Manager m = new Manager();
		m.setMaganerInfo(pf);
		
		rent1.setManager(m);
		//rent1.addReturnTerm(new ConditionCheckerOdometer(100));
		
		
		// another use-case branch
		/*
		Customer c = new Customer();
		
		ArrayList<Preference> buyitnow_prefs = new ArrayList<Preference>();
		buyitnow_prefs.add(new PreferenceSeatNumber(5));
		
		Vehicle v3 = br.getAvailableVehicle(buyitnow_prefs, depart, true);
		// if there's no v3, use weak preferences.. etc
		RentalBuyItNow rent2 = new RentalBuyItNow(c,v3,new Date(2014,11,06));
		*/
		
		// operation during rental
		
		//...
		
		
		// return of a car
		Manager manager = rent1.getManager();
		manager.inspectRentedVehicle(rent1);
		
		
		Car c = new Car();
		c.setHasAirConditioner(true);
		Preference pac = new PreferenceAirConditioner(c, true);
		System.out.println(pac.check());
		
		c.setSeatNumber(5);
		Preference psn = new PreferenceSeatNumber(c, 5);
		System.out.println(pac.check());
		
		/*
		// Creating car
		Vehicle car = new Car();
		car.setManufacturer("KIA Motors");
		car.setModel("Soul");
		car.setColor("Grey");
		car.setEngineVolume(1600);
		car.setFuelConsumption(8.0);
		car.setOdometer(12500);
		car.setPricePerDay(30);
		car.setGearBoxType("Automatic");
		car.setSeatNumber(5);
		car.setYearOfManufacture(2012);
		
		// Creating manager
		PersonInfo managerInfo = new PersonInfo();
		managerInfo.setFirstName("Anton");
		managerInfo.setPhoneNumber1("0111111111");
		
		Manager manager = new Manager();
		manager.setMaganerInfo(managerInfo);
		
		// Creating customer
		PersonInfo customerInfo = new PersonInfo();
		customerInfo.setFirstName("Vladimir");
		customerInfo.setPhoneNumber1("0222222222");
		
		Location customerLocation = new Location();
		customerLocation.setCountryName("Ukraine");
		customerLocation.setCountryCode("UA");
		customerLocation.setCityName("Kiev");
		customerLocation.setStreetName("Svobody Ave");
		customerLocation.setHouseName("2A");
		customerLocation.setApartmentName("67");
		
		Customer customer = new Customer();
		customer.setCustomerInfo(customerInfo);
		
		// Creating date range for booking
		DateRange dateRange = new DateRange();
		dateRange.setStarts(new Date(2014,11,06));
		dateRange.setEnds(new Date(2014,11,11));
		
		// Creating booking
		Booking booking = new Booking();
		booking.setBookedVehicle(car);
		booking.setBookingCustomer(customer);
		booking.setBookingManager(manager);
		booking.setBookingRange(dateRange);
		booking.setId(1234);
		booking.setRegDate(new Date());
		
		System.out.println("Super mega rental service");
		*/
	}

}
