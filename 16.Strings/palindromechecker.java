import java.util.*;
public class palindromechecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you wish: ");
        String str = sc.next();
        String newstr="";
        for (int i=str.length()-1;i>=0;i--){
            newstr+=str.charAt(i);
        }
        if (newstr.equals(str)){
            System.out.println("The String entered by you is a palindrome.");
        }
        else{
            System.out.println("The string entered by you is not a palindromic string.");
        }
        sc.close();
    }
}
