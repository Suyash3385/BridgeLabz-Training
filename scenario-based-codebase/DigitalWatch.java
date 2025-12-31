import java.util.Scanner;
public class DigitalWatch{
   public static void main(String[]args){
   
   Scanner sc=new Scanner(System.in);
   
   for(int hour=0;hour<24;hour++){
     for(int min=0;min<60;min++){
	 if(hour==13 && min==0){
	 System.out.println("power cut at 13:00");
	 break;
	 }
	 if(min<10){
	    System.out.println(hour + ":0" + min);
		}
		else{
		 System.out.println(hour + ":" + min);
		 }
		 }
		 if(hour==13){
		 break;
		 }
		 }
		 }
		 }