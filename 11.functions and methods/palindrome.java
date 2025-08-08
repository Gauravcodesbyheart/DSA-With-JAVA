import java.util.*;
public class palindrome {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int check = n;
        int rev = 0;
        while (n!=0){
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n/10;
        }
        if (rev == check){
            System.out.println(check+" is a palindrome number.");
        }
        else{
            System.out.println(check+" is not a palindrome number.");
        }
        sc.close();
    }
    
}
