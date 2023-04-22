package contactservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	// Tests for the correct format and expected to return true for all.
	@Test
	void testContact() {
		String id = "1";
		String firstName = "David";
		String lastName = "Vega";
		String phone = "2018675309";
		String address = "123 Main St Candia, NH 03034";
		
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		
		assertTrue(contact.getId().equals(id));
		assertTrue(contact.getFirstName().equals(firstName));
		assertTrue(contact.getLastName().equals(lastName));
		assertTrue(contact.getPhone().equals(phone));
		assertTrue(contact.getAddress().equals(address));
	}
	
	// Tests ID param for "null" value. Which if true, throws an exception.
	@Test
	void testContactIDIsNull() {
		String id = null;
		String firstName = "David";
		String lastName = "Vega";
		String phone = "2018675309";
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests ID param for length greater than ten (10). If true, throws an exception.
	@Test
	void testContactIDTooLong() {
		
		String id = "12345678901112";
		String firstName = "David";
		String lastName = "Vega";
		String phone = "2018675309";
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests the firstName param for "null" value. If true, throws and exception.
	@Test
	void testContactFirstNameIsNull() {
		String id = "12345";
		String firstName = null;
		String lastName = "Vega";
		String phone = "2018675309";
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests firstName param for length greater than ten (10). If true, throws an exception.
	@Test
	void testContactFirstNameTooLong() {
		
		String id = "12345678901112";
		String firstName = "David123456";
		String lastName = "Vega";
		String phone = "2018675309";
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests the lastName param for "null" value. If true, throws and exception.
	@Test
	void testContactLastNameIsNull() {
		
		String id = "12345";
		String firstName = "David";
		String lastName = null;
		String phone = "2018675309";
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}

	// Tests lastName param for length greater than ten (10). If true, throws an exception.
	@Test
	void testContactLastNameTooLong() {
		
		String id = "12345";
		String firstName = "David";
		String lastName = "Vega1234567";
		String phone = "2018675309";
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests the phone param for "null" value. If true, throws and exception.
	@Test
	void testContactPhoneNumberIsNull() {
		
		String id = "12345";
		String firstName = "David";
		String lastName = "Vega";
		String phone = null;
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests phone param for length NOT EQUAL to ten (10). If true, throws an exception.
	@Test
	void testContactPhoneNumberIsNotEqualToTen() {
		
		String id = "12345";
		String firstName = "David";
		String lastName = "Vega";
		String phone = "86753";
		String address = "123 Main St Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests address param for "null" value. If true, throws an exception.
	@Test
	void testContactAddressIsNull() {
		
		String id = "12345";
		String firstName = "David";
		String lastName = "Vega";
		String phone = "2018675309";
		String address = null;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	// Tests address param for length greater than 30. If true, throws an exception.
	@Test
	void testContactAddressTooLong() {
		
		String id = "12345";
		String firstName = "David";
		String lastName = "Vega";
		String phone = "2018675309";
		String address = "123 Main St Apt 203 Candia, NH 03034";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(id, firstName, lastName, phone, address);
		});		}
	
	
}
