import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        char[] s=input.toCharArray();
        reverseString(s);  
        System.out.println("Reversed string: " + new String(s));
    }
    public static void reverseString(char[] s){
        int left=0;
        int right=s.length-1;

        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
     }
    }
    }
