import java.util.*;
public class product {
    public static int  multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The product of given number is "+multiply(a,b));
        sc.close();

    }
}
