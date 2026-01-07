package BookBazaar;

public class EBook extends Book{
	EBook(String title,String author,double price,int stock){
		super(title,author,price,stock);
		
	}
	 public double applyDiscount() {
	        return price * 0.90;  
	    }

}
