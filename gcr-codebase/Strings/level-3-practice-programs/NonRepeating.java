import java.util.Scanner;
public class NonRepeating {
    public static char checkNonRepeating(String txt) {

        int freq[]=new int[256];
        // Count frequency
        for(int i=0; i < txt.length(); i++){
            char ch=txt.charAt(i);
            freq[ch]++;
            }

        // check nonrepeating
        for(int i = 0; i < txt.length(); i++){
            char ch = txt.charAt(i);
            if(freq[ch] == 1){
                return ch;
         }
        }
        return '\0';
      }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String txt=sc.nextLine();

        char result=checkNonRepeating(txt);

        if(result!='\0'){
            System.out.println("First non-repeating character " + result);
        }
		else{
            System.out.println("No non-repeating character found");
     }
  }
}
