package BookBazaar;
import java.util.*;
class Order {

    private String user;
    private Map<Book, Integer> items = new HashMap<>();
    private String status = "CREATED";   

    public Order(String user){
        this.user=user;
    }
    public boolean addBook(Book book, int quantity){
        if (book.reduceStock(quantity)){
            items.put(book, items.getOrDefault(book, 0)+quantity);
            return true;
    }
        return false;
    }

    public double computeTotal(){
        double total = 0;
        for (Book book:items.keySet()){
            double discountedPrice = book.applyDiscount();
            int qty = items.get(book);
            total += discountedPrice * qty;
    }
        return total;
    }

    protected void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    public String getStatus(){
        return status;
 }
}
