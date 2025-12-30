import java.util.Scanner;
public class FitnessTracker{
  public static void main(String[]args){
  
  Scanner sc=new Scanner(System.in);
  int pushups[]=new int[7];
  for(int i=0;i<pushups.length;i++){
  pushups[i]=sc.nextInt();
  }
 
  int total=0;
  int count=0;
  for(int res:pushups){
  if(res==0){
  continue;
  
  }
  total+=res;
  count++;

  }
  int avg=  (count > 0) ? total / count : 0;
   System.out.println("total : "+ total);
   System.out.println("avg : "+ avg);
   }
   }
   