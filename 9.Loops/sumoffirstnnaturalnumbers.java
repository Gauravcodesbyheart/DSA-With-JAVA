import java.util.*;
public class sumoffirstnnaturalnumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number You wish");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        sc.close();
        System.out.println("The sum of numbers from 1 to"+n+" is "+sum);
    }
}
