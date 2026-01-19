package AddressBookSystem;

public class Contact {
private String firstName;
private String lastName;
private String phone;
private String email;
Contact(String firstName,String lastName,String phone,String email){
	this.firstName=firstName;
	this.lastName=lastName;
	this.phone=phone;
	this.email=email;
}
public String getFullName() {
	return firstName+""+lastName;
}
public String getLastName() {
	return lastName;
}
public void setPhone(String phone) {
    this.phone=phone;
}
public void setEmail(String email) {
	this.email=email;
}
public void display() {
    System.out.println(getFullName() + " Phone: " + phone +  "  Email: " + email);
}
}
