import java.util.Scanner;

public class FestivalLuckyDraw{
  public static void main(String[]args){
  boolean luckyDraw=false;
  Scanner sc=new Scanner(System.in);
  do{
  System.out.println(" welcome to lucky draw! enter any number");
  
  int number=sc.nextInt();
  if(number%3==0 && number%5==0){
  
  luckyDraw=true;
  System.out.println("congrats you won a gift");
  }
  else{
    System.out.println("better luck next time");
	}
	} while(!luckyDraw);
	}
	}