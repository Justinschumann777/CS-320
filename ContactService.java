//justin schumann
package Contact;

import java.util.ArrayList;
public class ContactService {
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	public void displayContactList() {
		///we create options to enter name, ID, first and last name, contact number 
		for (int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).GetContactID());
			System.out.println("\t First Name: " + contactList.get(counter).GetFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).GetLastName());
			System.out.println("\t contact Number: " + contactList.get(counter).GetNumber());
			System.out.println("\t Address: " + contactList.get(counter).GetAddress() + "\n");
		}
	}
	public void addContact(String firstName, String lastName, String number, String address) {
		Contact contact = new Contact(firstName, lastName, number, address);
		contactList.add(contact);
	}


}
public void deletContact(String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if (contactList.get(counter).GetContactID().equals(contactID)) {
			contactList.remove(counter);
			break;
		}
		if (counter == contactList.size() - 1) {
			System.out.println("Contact ID: " + contactID + " not found.");
		}
	}
}
public void updateFirstName(String updatedString, String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if (contactList.get(counter).GetContactID().equals(contactID)) {
			contactList.get(counter).setFirstName(updatedString);
			break;
		}
		if (counter == contactList.size() - 1) {
			System.out.println("Contact ID: " + contactID + " not found.");
		}
	}
}
public void updateLastName(String updatedString, String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if (contactList.get(counter).GetContactID().equals(contactID)) {
			contactList.get(counter).setLastName(updatedString);
			break;
		}
		if (counter == contactList.size() - 1) {
			System.out.println("Contact ID: " + contactID + " not found.");
		}
	}
}
public void updateNumber(String updatedString, String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if (contactList.get(counter).GetContactID().equals(contactID)) {
			contactList.get(counter).setNumber(updatedString);
			break;
		}
		if (counter == contactList.size() - 1) {
			System.out.println("Contact ID: " + contactID + " not found.");
		}
	}
}
public void updateAddress(String updatedString, String contactID) {
	for (int counter = 0; counter < contactList.size(); counter++) {
		if (contactList.get(counter).GetContactID().equals(contactID)) {
			contactList.get(counter).setAddress(updatedString);
			break;
		}
		if (counter == contactList.size() - 1) {
			System.out.println("Contact ID: " + contactID + " not found.");
		}
	}
}


	
}
	