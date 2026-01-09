package FoodLoop;
import java.util.ArrayList;
import java.util.List;
public class Order implements  IOrderable{
	List<FoodItem> items = new ArrayList<>();
    double total;
    public Order() {}
    public Order(FoodItem... comboItems) {
        for (FoodItem item : comboItems) {
            addItem(item);
        }
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
        } else {
            System.out.println(item.name + " is not available!");
        }
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully. Total = ₹" + total);
    }

    @Override
    public void cancelOrder() {
        for (FoodItem item : items) {
            item.increaseStock();
        }
        items.clear();
        System.out.println("Order cancelled and stock restored.");
    }

 
    public double applyDiscount(double total) {
        if (total > 500) return total * 0.20;   
        if (total > 300) return total * 0.10;   
        return 0;
    }
    public void calculateTotal() {
        double sum = 0;
        for (FoodItem item : items) {
            sum += item.price;
        }
        double discount = applyDiscount(sum);
        this.total = sum - discount;
  }
}
