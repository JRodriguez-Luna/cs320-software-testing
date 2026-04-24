package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.contactservice.*;


class ContactServiceTest {
	private ContactService cs;
	private Contact t1;
	   
	@BeforeEach 
	void setUp() {
      cs = new ContactService();
      t1 = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
	}
   
   
	// Adding Contact
	@Test
	void testAddContact() {
		 cs.addContact(t1);
		 assertEquals(t1, cs.getContact("123"));
	}
	
	// Deleting Contact
	@Test
	void testDeleteContact() {
	    cs.addContact(t1);
	    cs.deleteContact("123");
	    assertThrows(IllegalArgumentException.class, () -> {
	        cs.getContact("123");
	    });
	}
	
	// Update Contact per Field
	
	// First Name
	@Test
	void testUpdateFirstName() {
		cs.addContact(t1);
		cs.updateFirstName(t1.getId(), "NewName");
		assertEquals(cs.getContact(t1.getId()).getFirstName(), "NewName");
	}
	
	// Last Name
	@Test
	void testUpdateLastName() {
		cs.addContact(t1);
		cs.updateLastName(t1.getId(), "NewLast");
		assertEquals(cs.getContact(t1.getId()).getLastName(), "NewLast");
	}
	
	// Phone Number
	@Test
	void testUpdatePhoneNumber() {
		cs.addContact(t1);
		cs.updatePhoneNumber(t1.getId(), "0987654321");
		assertEquals(cs.getContact(t1.getId()).getPhoneNumber(),"0987654321");
	}
	
	// Address
	@Test
	void testUpdateAddress() {
		cs.addContact(t1);
		cs.updateAddress(t1.getId(), "321 New St");
		assertEquals(cs.getContact(t1.getId()).getAddress(), "321 New St");
	}
	
	// Duplicates Test - UUI
	@Test
	void testAddDuplicateId() {
		cs.addContact(t1);
		assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact(t1);
		});
	}
	

}
