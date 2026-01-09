package Artify;

public class User {
private String name;
private int balance;
User(String name,int balance){
	this.name=name;
	this.balance=balance;
}
public String getName() {
	return name;
}
public int getBalance() {
	return balance;
}
public void deductBalance(int amount) {
	if(balance>=amount) {
		balance-=amount;
	}
	else {
		System.out.println("insufficient balance");
	}
}

}
