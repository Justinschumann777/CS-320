//justin schumann
package Test;
import org.junit.jupiter.api.*;;
import Contact.Contact;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {
	@Test 
	@DispalyName("Contact name must not have over 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("OllyOllyOxenFree", "LastName", "PhoneNumbr", "Address");
		if (contact.GetFirstName().length() > 10) {
			fail("Error!: Your first name has more than 10 letters!");
		}
	}
	@Test 
	@DispalyName("Contact name must not have over 10 characters")
	void testContactLastNameWithMoreThanTenCharacters1() {
		Contact contact = new Contact("OllyOllyOxenFree", "LastName", "PhoneNumbr", "Address");
		if (contact.GetLastName().length() > 10) {
			fail("Error!: Your first name has more than 10 letters!");
		}
	}
	@Test 
	@DispalyName("Contact number must not have over 10 characters")
	void testContactNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("OllyOllyOxenFree", "LastName", "PhoneNumbr", "Address");
		if (contact.GetNumber().length() > 10) {
			fail("Error!: Your number has more than 10 digits!");
		}
	}
	@Test
	@DisplayName("Contact address must not have over 30 characters")
	void testContactAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr",
				"123456789 is nine characters long" + "123456789 is another nine characters long");
		if (contact.GetAddress().length() > 30) {
			fail("Address has more than 30 characters.");
		}
	}

	@Test
	@DisplayName("Contact First Name shouldn't be a null!")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact(null, "LastName", "PhoneNumbr", "Address");
		assertNotNull(contact.GetFirstName(), "Invalid First name.");
	}

	@Test
	@DisplayName("Contact Last Name shouldn't be a null")
	void testContactLastNameNotNull() {
		Contact contact = new Contact("FirstName", null, "PhoneNumbr", "Address");
		assertNotNull(contact.GetFirstName(), "Invalid last name.");
	}

	@Test
	@DisplayName("Contact Number shouldn't be a null")
	void testContactPhoneNotNull() {
		Contact contact = new Contact("FirstName", "LastName", null, "Address");
		assertNotNull(contact.GetNumber(), "Invalid contact number.");
	}

	@Test
	@DisplayName("Contact Address shouldn't be a null")
	void testContactAddressNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", null);
		assertNotNull(contact.GetAddress(), "Invalid adrress.");
	}

}
