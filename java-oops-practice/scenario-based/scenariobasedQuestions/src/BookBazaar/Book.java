package BookBazaar;

abstract class Book implements IDiscountable {
private String title;
private String author;
protected double price;
private int stock;
Book(String title,String author,double price,int stock){
	this.title=title;
	this.author=author;
	this.price=price;
	this.stock=stock;
	
}
public String getTitle(){
	return title; 
	}
public double getPrice(){
	return price; 
	}
public int getStock(){
	return stock;
	}
public boolean reduceStock(int qty){
    if (qty<=stock){
        stock-=qty;
        return true;
    }
    return false;
    }

public void addStock(int qty){
    stock+=qty;
}

@Override
public abstract double applyDiscount(); 
}

