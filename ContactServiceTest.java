package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	ContactService contactSvcList = new ContactService();
	String firstName = "David";
	String lastName = "Vega";
	String phone = "2018675309";
	String address = "123 Main St Candia, NH 03034";
	

	@Test
	void testAddContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactSvcList.addContact(firstName, lastName, phone, address);
			assertTrue(contactSvcList.searchByID("1").getFirstName().equals("David"));
		});		}
	
	@Test
	void testUpdateContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {

			contactSvcList.addContact(firstName, lastName, phone, address);
			contactSvcList.updateLastName("1", "VegaChase");
//			assertTrue(contactSvcList.searchByID("1").getLastName().equals("VegaChase"));
		});		}
	
	@Test
	void testdeleteContact() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactSvcList.addContact(firstName, lastName,phone, address);
			contactSvcList.updateLastName("1", "Vega-Chase");
//			assertTrue(contactSvcList.searchByID("1").getId().equals("1"));
			contactSvcList.deleteContact("1");
		}); }
	}
