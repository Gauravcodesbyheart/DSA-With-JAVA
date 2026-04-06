import java.util.*;
public class FactorialOfNumber {

    public static int Factorial(int n){
        if (n==0){
            return 1;
        }
        int result = n*Factorial(n-1);
        return result;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find factorial: ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is : "+Factorial(n));
        sc.close();
    }
}
