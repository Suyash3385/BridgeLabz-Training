import java.util.Scanner;
 public class BusAttendanceSystem{
  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
  String []students={"amit","raj","shivam","priya","krish","suraj","riya","neha",
  "vinay","jay"};
  
  int present=0,absent=0;
  for(String name:students){
  System.out.println("is " + name + "present or absent");
  char status=sc.next().toUpperCase().charAt(0);
  if(status=='P'){
  present++;
  }
  else if(status=='A'){
  absent++;
  }
  else{
  System.out.println("invalid input");
  absent++;
  }
  }
   System.out.println("total students" + students.length);
    System.out.println("present" + present);
	 System.out.println("absent"+ absent);
	 }
	 }