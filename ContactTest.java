package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.contactservice.Contact;


class ContactTest {

	@Test
    void testValidContact() {
		Contact t1 = new Contact("123", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("123", t1.getId());
        assertEquals("John", t1.getFirstName());
        assertEquals("Doe", t1.getLastName());
        assertEquals("1234567890", t1.getPhoneNumber());
        assertEquals("123 Main St", t1.getAddress());
    }
	
	// Null Cases
	@Test
	void testNullId() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(null, "John", "Doe", "1234567890", "123 Main St");
	    });
	}

	@Test
	void testNullFirstName() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", null, "Doe", "1234567890", "123 Main St");
	    });
	}

	@Test
	void testNullLastName() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "John", null, "1234567890", "123 Main St");
	    });
	}

	@Test
	void testNullPhone() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "John", "Doe", null, "123 Main St");
	    });
	}
	@Test
	void testNullAddress() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "John", "Doe", "1234567890", null);
	    });
	}
	
	// Characters over 10
	
	@Test
	void testIdTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
	    });
	}
	
	@Test
	void testFirstNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "JohnJohnJohn", "Doe", "1234567890", "123 Main St");
	    });
	}

	@Test
	void testLastNameTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "John", "Doessssssss", "1234567890", "123 Main St");
	    });
	}

	@Test
	void testPhoneWrongLength() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "John", "Doe", "123", "123 Main St");
	    });
	}

	@Test
	void testAddressTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123", "John", "Doe", "1234567890", "123 Main St 123 Main St 123 Main St 123 Main St");
	    });
	}

}
