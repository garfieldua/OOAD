package com.vateam.rental;

import java.util.Date;

public class PersonInfo {

	//private Location location;
	private String firstName;
	private String secondName;
	private String phoneNumber1;
	private String phoneNumber2;
	private String emailAddress;
	private String idNumber;
	private Date birthDate;
	
	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setPassportNumber(String idNumber) {
		this.idNumber = idNumber;
	}

//	public Location getLocation() {
//		return location;
//	}
//	
//	public void setLocation(Location location) {
//		this.location = location;
//	}
//	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
