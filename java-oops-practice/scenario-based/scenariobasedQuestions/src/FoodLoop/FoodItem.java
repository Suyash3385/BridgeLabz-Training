package FoodLoop;

public class FoodItem {
String name;
String category;
int price;
int stock;

FoodItem(String name,String category,int price,int stock){
	this.name=name;
	this.category=category;
	this.price=price;
	this.stock=stock;
	
}
public boolean isAvailable() {
    return stock > 0;
}

public void reduceStock() {
    if (stock > 0) stock--;
}

public void increaseStock() {
    stock++;
}
}
 
