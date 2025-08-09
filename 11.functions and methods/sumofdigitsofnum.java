import java.util.*;
public class sumofdigitsofnum {
    
    public static int sum(int n){
        int sum = 0;
        while (n>0){
        int ld = n%10;
        sum = sum+ld;
        n = n/10;
        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to get sum : ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("The sum of the all digits of the number is :"+result);
        sc.close();
    }
    
}
