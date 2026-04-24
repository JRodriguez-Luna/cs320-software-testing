package com.contactservice;

public class Contact {
	private final String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact (String id, String firstName, String lastName, String phoneNumber, String address) {
		// ID Check
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		// First name Check
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		// Last name Check
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		// Phone Check
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		// Address Check
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	// Get
	public String getId() { return this.id; }
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public String getPhoneNumber() { return this.phoneNumber; }
	public String getAddress()  { return this.address; }
	
	// Set
	public void setFirstName (String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		this.firstName = firstName;
	}
	
	public void setLastName (String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		this.lastName = lastName;
	}
	
	public void setPhoneNumber (String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress (String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.address = address;
	}
	
}
