import java.util.*;
public class palindromestringchecker{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want: ");
        String str=sc.next();
        String newstr = "";
        for (int i=str.length()-1;i>=0;i--){
            newstr += str.charAt(i);
        }
        if (str.equals(newstr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        sc.close();
    }
}