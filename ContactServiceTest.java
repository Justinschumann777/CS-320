import java.lang.reflect.Array;
package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import Contact.Contact;
import Contact.ContactService;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)

/**
 * 
 */

/**
 * @author justinschuman_snhu
 *
 */
public class ContactServiceTest {
	@Test
	@DisplayName(" First Name update test.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Sir.", "Road", "2222221111", "123 Grand Avenue");
		service.updateFirstName("Jenn", "9");
		service.displayContactList();
		assertEquals("Jenn", service.getContact("9").getFirstName(), "Error!: First name was not updated.");
	}

	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Sir.", "Road", "2222221111", "123 Grand Avenue");
		service.updateLastName("Tommy", "11");
		service.displayContactList();
		assertEquals("Tommy", service.getContact("11").getLastName(), "Error!: Last name isn't updated.");
	}

	@Test
	@DisplayName("Contact number update test.")
	@Order(3)
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("Sir.", "Road", "2222221111", "123 Grand Avenue");
		service.updateNumber("2222221111", "19");
	
		assertEquals("2222221111", service.getContactNumber("19").getNumber(), "Error!: Contact number isn't updated.");
	}

	@Test
	@DisplayName("Test to update address.")
	@Order(4)
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Sir.", "Road", "2222221111", "123 Grand Avenue");
		service.updateAddress("321 Opposite Avenue", "13");
		service.displayContactList();
		assertEquals("321 Opposite Avenue", service.getContact("13").getAddress(), "Error!: Address isn't updated.");
	}

	@Test
	@DisplayName("Contact delection test.")
	@Order(5)
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("Sir.", "Road", "2222221111", "123 Grand Avenue");
		service.deletContact("17");
		
		ArrayList<Contact> contactListEmpty = new Array<Contact>();
		service.displayContactList();
		assertEquals(service.contactList, contactListEmpty, "Error!: contact delection fail!.");
	}

	@Test
	@DisplayName("Testing if contact can be added.")
	@Order(6)
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("Sir.", "Road", "5555551111", "123 Lollypop Lane");
		service.displayContactList();
		assertNotNull(((Object) service).GetContact("0"), "Error!: Contact was unable to be  added.");
	}


}
