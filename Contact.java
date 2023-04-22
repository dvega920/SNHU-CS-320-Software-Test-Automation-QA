package contactservice;

import java.lang.IllegalArgumentException;

/* 
Contact class initial setup:
- declare private variables of type String for each requirement
*/
public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/* Create public method that passes in the above requirements as arguments.
	*  The "if" statements check each requirement to see if it contains "null" or is greater than the specified value. 
	*  If either condition is true then an exception is thrown and displayed to user.
	 */
	public Contact (String id, String firstName, String lastName, String phone, String address) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("invalid id");
		}
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
				
		// If the conditions are false then the values are set to the object variables. 
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// "getter(s)" methods to return the value of the object variable(s). Accesses the values ONLY and returns them.
		public String getId() {
			return id;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getPhone() {
			return phone;
		}
		public String getAddress() {
			return address;
		}
	
		/* "setter(s)" methods set the values of the object variable(s). These are UPDATEABLE.
		 * ID's must be unique and cannot be modified. Excluded "setID()" from the below methods.
		 */

		
		public void setFirstName(String newFirstName) {
			if (newFirstName == null || newFirstName.length() > 10) {
				throw new IllegalArgumentException("invalid first name");
			}
//			firstName = newFirstName;
		}
		public void setLastName(String newLastName) {
			if (newLastName == null || newLastName.length() > 10) {
				throw new IllegalArgumentException("invalid last name");
			}
//			lastName = newLastName;
		}
		public void setPhone(String newPhone) {
			if (newPhone == null || newPhone.length() != 10) {
				throw new IllegalArgumentException("invalid phone");
			}
//			phone = newPhone;
		}
		public void setAddress(String newAddress) {
			if (newAddress == null || newAddress.length() > 30) {
				throw new IllegalArgumentException("invalid address");
			}
//			address = newAddress;
		}
	
	
	
	
}

