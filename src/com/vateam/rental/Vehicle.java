package com.vateam.rental;

abstract public class Vehicle {
	
	private Integer pricePerDay;
	private String color;
	private Integer seatNumber;
	private Integer odometer;
	private String manufacturer;
	private String model;
	private Double fuelConsumption;
	private Integer engineVolume;
	private Integer yearOfManufacture;
	// change to some enum?
	private String gearBoxType;
	
	public Integer getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(Integer pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Integer getOdometer() {
		return odometer;
	}
	public void setOdometer(Integer odometer) {
		this.odometer = odometer;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(Integer yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public Double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(Double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public Integer getEngineVolume() {
		return engineVolume;
	}
	public void setEngineVolume(Integer engineVolume) {
		this.engineVolume = engineVolume;
	}
	public String getGearBoxType() {
		return gearBoxType;
	}
	public void setGearBoxType(String gearBoxType) {
		this.gearBoxType = gearBoxType;
	}
	

}
