package com.Address_Book;
import java.util.Scanner;
public class Address_Book {

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program");
		newAddressBook person = new newAddressBook();
		person.addContact();
	}
}
class contactDetails {
	private String firstName;
	private String lastName;
	private String addressCity;
	private String state;
	private int zip;
	private long phoneNumber;
	private String email;


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName
	(String lastName) {
		this.lastName = lastName;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return
				" FirstName : " + firstName +
				" LastName : " + lastName +
				" Address City : " + addressCity +
				" State : " + state +
				" Zip : " + zip +'\'' +
				" PhoneNumber : " + phoneNumber +'\'' +
				" Email : " + email;
	}
}
class newAddressBook {

	Scanner scanner = new Scanner(System.in);

	public void addContact() {
		contactDetails person = new contactDetails();
		System.out.println("Enter First Name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter last Name: ");
		String lastName = scanner.nextLine();
		System.out.println("Enter your addressCity: ");
		String addressCity = scanner.nextLine();
		System.out.println("Enter your state: ");
		String state = scanner.nextLine();
		System.out.println("Enter zip code : ");
		Long zip = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter phone number: ");
		Long phoneNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter your EMail ID: ");
		String email = scanner.nextLine();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddressCity(addressCity);
		person.setState(state);
		person.setZip(zip.intValue());
		person.setPhoneNumber(phoneNumber.intValue());
		person.setEmail(email);
		System.out.println("The Contact Details of "+firstName+ "\n"+ person);
	}
}
	