package MediStore;
import java.time.LocalDate;

public abstract class Medicine implements ISellable {
    private String name;
    private double price;
    private LocalDate expiryDate;
    private int quantity;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50);
    }
    public Medicine(String name, double price, LocalDate expiryDate, int quantity){
        this.name=name;
        this.price=price;
        this.expiryDate=expiryDate;
        this.quantity=quantity;
    }
    private double calculateTotalPrice(int qty) {
        return qty*price;
    }
    private double applyDiscount(double total) {
        if (total>500) return total *0.90;
        return total;
    }
    @Override
    public double sell(int qty) {
        if (qty>quantity) {
            System.out.println(" Not enough stock");
            return 0;
    }
        if(checkExpiry()){
            System.out.println(" Cannot sell expired medicine");
            return 0;
        }
        quantity -= qty;
        double bill = calculateTotalPrice(qty);
        return applyDiscount(bill);
    }
    @Override
    public abstract boolean checkExpiry();

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public LocalDate getExpiryDate() { return expiryDate; }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Stock: " + quantity);
   
 }
}
