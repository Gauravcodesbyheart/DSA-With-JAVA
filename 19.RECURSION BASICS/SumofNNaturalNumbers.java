import java.util.*;
public class SumofNNaturalNumbers {
    public static int SummationOfNaturalNumbers(int n){
        if (n==1){
            return 1;
        }
        int result=n+SummationOfNaturalNumbers(n-1);
        return result;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n =sc.nextInt();
        int result = SummationOfNaturalNumbers(n);
        System.out.println(result+" is the sum of numbers from 1 to "+n+".");
        sc.close();
    }
}
