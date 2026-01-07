package BookBazaar;

public class Main {
	    public static void main(String[] args) {

	        Book b1=new EBook("Java Mastery", "John Wick", 500, 50);
	        Book b2=new PrintedBook("Algorithms", "Robert Sedgewick", 800, 10);
	        Order order=new Order("Suyash");
	        order.addBook(b1, 2);
	        order.addBook(b2, 1);
	        double total=order.computeTotal();
	        System.out.println("User: Suyash");
	        System.out.println("Order Status: " + order.getStatus());
	        System.out.println("Total Payable: " + total);
    }
	}
