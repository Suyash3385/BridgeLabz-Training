package swiftcart;

abstract class Product {
	String name;
	double price;
	String category;
	
	Product (String name,double price,String category){
		this.name=name;
		this.price=price;
		this.category=category;
	}
	   abstract double getDiscount(double total);

	    public double getPrice() {
	        return price;
	    }

	    public String getName() {
	        return name;
	    }
	}


