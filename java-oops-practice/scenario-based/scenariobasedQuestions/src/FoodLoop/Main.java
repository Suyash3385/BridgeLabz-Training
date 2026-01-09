package FoodLoop;

public class Main {

	
	public class FoodLoopTest {
	    public static void main(String[] args) {

	        VegItem paneer = new VegItem("Paneer Tikka","veg", 180, 5);
	        VegItem burger = new VegItem("Veg Burger","veg", 120, 3);
	        NonvegItem chicken = new NonvegItem("Chicken Biryani","nonveg", 250, 4);
	        
	        Order o1 = new Order();
	        o1.addItem(paneer);
	        o1.addItem(burger);
	        o1.addItem(chicken);
	        o1.placeOrder();

	        
	        Order combo = new Order(paneer, chicken);  
	        combo.placeOrder();

	        combo.cancelOrder();
	    }
	}

}
 