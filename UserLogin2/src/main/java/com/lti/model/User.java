package com.lti.model;

public class User {
	private int passengerId;
	
	private String passengerName;
	
	private String passengerEmail;
	
	private String passengerPhoneNumber;

	private int passengerAge;

	private char passengerGender;

	private String password;
	
	public User(int passengerId, String passengerName, String passengerEmail, String passengerPhoneNumber,
			int passengerAge, char passengerGender, String password) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerEmail = passengerEmail;
		this.passengerPhoneNumber = passengerPhoneNumber;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.password = password;
	}
	public User() {
		super();
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerPhoneNumber() {
		return passengerPhoneNumber;
	}
	public void setPassengerPhoneNumber(String passengerPhoneNumber) {
		this.passengerPhoneNumber = passengerPhoneNumber;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public char getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(char passengerGender) {
		this.passengerGender = passengerGender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerEmail="
				+ passengerEmail + ", passengerPhoneNumber=" + passengerPhoneNumber + ", passengerAge=" + passengerAge
				+ ", passengerGender=" + passengerGender + ", password=" + password + "]";
	}
	
	
}
