package BookBazaar;

public class PrintedBook extends Book{
	PrintedBook(String title,String author,double price,int stock){
	super(title,author,price,stock);
	}

	public double applyDiscount() {
		return price * 0.95;
	}
}
