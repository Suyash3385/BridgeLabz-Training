package AddressBookSystem;

public class Main {
	  public static void main(String[] args) {

	        AddressBook book=new AddressBook();

	        book.addContact(new Contact( "Aarav", "Sharma", "9876543210", "aarav@gmail.com"  ));

	        book.addContact(new Contact(  "Meera", "Patil", "9123456789",  "meera@gmail.com" ));
	        System.out.println(" Edit Contact:");
	        book.editContact("Aarav Sharma", "9999999999", "aarav_new@gmail.com");

	        System.out.println(" All Contacts (Sorted):");
	        book.displaySortedContacts();


	        System.out.println(" Final Contact List:");
	        book.displaySortedContacts();
	    }
	}


