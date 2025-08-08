import java.util.*;
public class ternaryoperators {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int value = (a>b)? a: b;
        System.out.println(value+"is the greatest among th givern two numbers");
        sc.close();

    }
    
}
