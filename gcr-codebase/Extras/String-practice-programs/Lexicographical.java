import java.util.Scanner;

public class Lexicographical {

    public static int compareStrings(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());

        for(int i =0; i<len; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
      }
     }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1 =sc.nextLine();
        String s2 =sc.nextLine();

        int result = compareStrings(s1, s2);

        if (result ==0) {
            System.out.println("Both strings are equal");
        } 
		else if(result <0) {
            System.out.println("First string comes before second string");
        }
		else {
            System.out.println("First string comes after second string");
    }
    }
}
