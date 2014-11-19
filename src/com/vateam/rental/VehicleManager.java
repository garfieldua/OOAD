package com.vateam.rental;

import java.util.ArrayList;

// this class is designed to access db to manage vehicles
public class VehicleManager {
	
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public VehicleManager() {
		
		Department d = new Department();
		d.setId(15);
		
		Car car = new Car();
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
		
		Car car2 = new Car();
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
		
		Motorbike moto = new Motorbike();
		moto.setModel("lolka");
		moto.setCurDepartament(d);
		moto.setAvailable(true);
		moto.setSeatNumber(4);
		
		vehicles.add(car);
		vehicles.add(car2);
		vehicles.add(moto);
    }
	 
    
    public ArrayList<Vehicle> getAllVehicles() {
		return new ArrayList<Vehicle>(vehicles);
    }
}
