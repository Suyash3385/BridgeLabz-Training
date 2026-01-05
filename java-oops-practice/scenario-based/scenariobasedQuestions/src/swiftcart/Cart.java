package swiftcart;
import java.util.*;

class Cart implements ICheckout {
    private List<Product> products;
    private double totalPrice;
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

  
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice(); 
        }
    }

    public void addProduct(Product p) {
        products.add(p);
        calculateTotal();
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (Product p : products) {
            discount += p.getDiscount(totalPrice);
        }

        totalPrice = totalPrice - discount; // operator -
    }

    @Override
    public void generateBill() {

        for (Product p : products) {
            System.out.println(p.getName() + " : ₹" + p.getPrice());
        }
        System.out.println("Final Amount: ₹" + totalPrice);
    }
}
