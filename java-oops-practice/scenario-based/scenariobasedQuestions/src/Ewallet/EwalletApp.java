package Ewallet;

public class EwalletApp {
	

	    public static void main(String[] args) {

	        User u1 = new User(1, "Suyash", new PersonalWallet(3000), 500);
	        User u2 = new User(2, "Amit", new BusinessWallet(10000));

	        u1.getWallet().transferTo(u2, 2000);
	        u2.getWallet().transferTo(u1, 3000);

	        System.out.println("Suyash Balance: ₹" + u1.getWallet().getBalance());
	        System.out.println("Amit Balance: ₹" + u2.getWallet().getBalance());

	        System.out.println("\nSuyash Transactions:");
	        u1.getWallet().showTransactions();

	        System.out.println("\nAmit Transactions:");
	        u2.getWallet().showTransactions();
	    }
	}


