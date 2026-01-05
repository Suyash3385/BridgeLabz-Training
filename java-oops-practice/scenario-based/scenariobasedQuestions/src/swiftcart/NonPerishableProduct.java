package swiftcart;

	class NonPerishableProduct extends Product {

	    public NonPerishableProduct(String name, double price) {
	        super(name, price, "nonperishable");
	    }

	    @Override
	    double getDiscount(double total) {
	        return total * 0.05; 
	    }
	}



