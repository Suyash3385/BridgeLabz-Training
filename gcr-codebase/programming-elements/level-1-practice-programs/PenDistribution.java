public class PenDistribution{
public static void main(String[]args){
int students=14, pens=3;
int remainder=students%pens;
int quantity=students/pens;
System.out.println("The Pen Per Student is" + quantity + "and the remaining pen not distributed is"+ remainder);
}
}