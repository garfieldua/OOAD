package com.vateam.rental;

import java.util.ArrayList;

// class is designed to access the database in the future

public class GlobalManager {
	
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	// singleton
	private static GlobalManager _obj;
	 
	private GlobalManager() {
		
		Department d = new Department();
		d.setId(15);
		
		Vehicle car = new Car();
		car.setManufacturer("KIA Motors");
		car.setModel("Soul");
		car.setColor("Grey");
		car.setEngineVolume(1600);
		car.setFuelConsumption(8.0);
		car.setOdometer(12500);
		car.setPricePerDay(30);
		car.setGearBoxType("automatic");
		car.setSeatNumber(5);
		car.setYearOfManufacture(2012);
		car.setHasAirConditioner(false);
		car.setAvailable(true);
		car.setCurDepartament(d);
		
		Vehicle car2 = new Car();
		car2.setManufacturer("Nissan Motors");
		car2.setModel("Juke");
		car2.setColor("Color");
		car2.setEngineVolume(1300);
		car2.setFuelConsumption(9.5);
		car2.setOdometer(13500);
		car2.setPricePerDay(45);
		car2.setGearBoxType("automatic");
		car2.setSeatNumber(4);
		car2.setYearOfManufacture(2011);
		car2.setHasAirConditioner(true);
		car2.setAvailable(true);
		car2.setCurDepartament(d);
		
		vehicles.add(car);
		vehicles.add(car2);
    }
	 
    public static GlobalManager getInstance() {
        if (_obj == null) {
        	_obj = new GlobalManager();
        }
        
        return _obj;
    }
    
    public ArrayList<Vehicle> getAllVehicles() {
		return new ArrayList<Vehicle>(vehicles);
    }
}
