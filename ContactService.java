package com.contactservice;
import java.util.*;


public class ContactService {
    private final Map<String, Contact> cs = new HashMap<>();
    
    // Find ID else Throw Error
    public void hasId(String id) {
    	if (!cs.containsKey(id)) {
    		throw new IllegalArgumentException("ID does not exists");
    	}
    }
	
    // Add
	public void addContact (Contact c) {
		if (cs.containsKey(c.getId())) {
            throw new IllegalArgumentException("ID already exists");
		}
		
		cs.put(c.getId(), c);
	}
	
	// Delete
	public void deleteContact (String id) {
		hasId(id);
		cs.remove(id);
	}
	
	// Update fields
	// First name
	public void updateFirstName(String id, String firstName) {
		hasId(id);
		cs.get(id).setFirstName(firstName);
	}
	
	// Last name
	public void updateLastName(String id, String lastName) {
		hasId(id);
		cs.get(id).setLastName(lastName);
	}
	
	// Number
	public void updatePhoneNumber(String id, String phoneNumber) {
		hasId(id);
		cs.get(id).setPhoneNumber(phoneNumber);
	}
	
	// Address
	public void updateAddress(String id, String address) {
		hasId(id);
		cs.get(id).setAddress(address);

	}
	
	// Helper Function
	public Contact getContact(String id) {
		hasId(id);
		return cs.get(id);
	}
}
