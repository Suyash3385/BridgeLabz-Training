import java.util.Scanner;
public class RemoveCharacter {
    public static String removeChar(String s, char ch) {
        String result = "";
        for(int i=0; i s.length();i++){
            if(s.charAt(i)!= ch) {
                result += s.charAt(i);
         }
    }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        String output = removeChar(s, ch);
        System.out.println("Result: " + output);
    }
}
