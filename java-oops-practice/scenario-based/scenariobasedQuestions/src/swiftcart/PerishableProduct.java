package swiftcart;


	class PerishableProduct extends Product {

	    public PerishableProduct(String name, double price) {
	        super(name, price ,"perishable");
	    }

	    @Override
	    double getDiscount(double total) {
	        return total * 0.10; 
	    }
	}



