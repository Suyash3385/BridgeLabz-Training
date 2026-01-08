package TourMate;

public class Transport {
private String type;
private double cost;
Transport(String type,double cost){
	this.type=type;
	this.cost=cost;
}
public double getCost() {
	return cost;
}
public void showDetails() {
	System.out.println("transport "+ type + "cost" + cost);
}
}
