package AddressBookSystem;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	public class AddressBook {
	    private ArrayList<Contact>contacts=new ArrayList<>();
	    public void addContact(Contact contact) {
	        for (Contact c:contacts) {
	            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
	                System.out.println(" Duplicate");
	                return;
	            }
	        }
	        contacts.add(contact);
	        System.out.println("contact added ");
	    }
	    public void editContact(String name, String newPhone, String newEmail) {
	        for (Contact c:contacts) {
	            if (c.getFullName().equalsIgnoreCase(name)) {
	                c.setPhone(newPhone);
	                c.setEmail(newEmail);
	                System.out.println("Contact updated");
	                return;
	            }
	        }
	        System.out.println(" Contact not found");
	    }
	    
	    public void displaySortedContacts() {
	        Collections.sort(contacts, Comparator.comparing(Contact::getFullName));
	        for (Contact c : contacts) {
	            c.display();
	        }
	    }

	}


