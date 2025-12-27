package com.constructors.levelone;

public class Circle{
	
	double radius;
	Circle(){
		this(1.0);
	   }
	Circle(double radius){
		this.radius=radius;
	 }
    double area(){
        return Math.PI *radius* radius;
       }

    
    void display(){
        System.out.println("Radius: " + radius);
        System.out.println("Area  : " + area());
        
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        Circle c2 = new Circle(5.0);
        c2.display();
   }
}
	
