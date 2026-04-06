import java.util.*;
public class Fibnumber {
    public static int FibbonacciNumber(int n){
        if (n<=1){
            return n ;
        }
        
        else{
            return FibbonacciNumber(n-1)+FibbonacciNumber(n-2);
        }
        
    }
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nth number of fibonacci series you want to print: ");
    int n = sc.nextInt();
    int result=FibbonacciNumber(n);
    System.out.println(result+" is the "+n+"th term of the fibonacci series.");

    sc.close();
   } 
}
