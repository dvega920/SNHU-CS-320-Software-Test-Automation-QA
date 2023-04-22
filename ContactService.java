package contactservice;

import java.lang.IllegalArgumentException;
import java.util.ArrayList;

public class ContactService {
	private int idNum = 0;
	private String uniqueID = String.valueOf(idNum);
	
	
	private ArrayList<Contact> contactsList = new ArrayList<>();
	
	public Contact searchByID(String contactID) {
		int index = 0;
		while(index < contactsList.size()){
			if(contactID.equals(contactsList.get(index).getId())) {
				return contactsList.get(index);
			}
			index++;
		}
		throw new IllegalArgumentException("Contact does not exist");
	}
	
	public String idGenerator() {
		idNum++;
		
		return uniqueID;
	}
	
	public void addContact(String firstName, String lastName, String phone, String address) {
		Contact contact = new Contact(idGenerator(), firstName, lastName, phone, address);
		contactsList.add(contact);
	}
	
	public void deleteContact(String contactID) {
		contactsList.remove(searchByID(uniqueID));
	}
	
	public void updateFirstName(String contactID, String firstName) {
		searchByID(contactID).setFirstName(firstName);
	}
	public void updateLastName(String contactID, String lastName) {
		searchByID(contactID).setLastName(lastName);
	}
	public void updatePhone(String contactID, String phone) {
		searchByID(contactID).setPhone(phone);
	}
	public void updateAddress(String contactID, String address) {
		searchByID(contactID).setAddress(address);
	}
}
