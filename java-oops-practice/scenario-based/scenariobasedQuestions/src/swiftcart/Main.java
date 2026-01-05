package swiftcart;

public class Main {

	    public static void main(String[] args) {

	        Product p1 = new PerishableProduct("Milk", 50);
	        Product p2 = new PerishableProduct("Vegetables", 100);
	        Product p3 = new NonPerishableProduct("Rice", 200);

	        Cart cart = new Cart();
	        cart.addProduct(p1);
	        cart.addProduct(p2);
	        cart.addProduct(p3);

	        cart.applyDiscount();  
	        cart.generateBill();   
	    }
	}


