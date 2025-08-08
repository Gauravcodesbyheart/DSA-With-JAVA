import java.util.*;
public class primeinrange {
    public static boolean isprime(int n){
        boolean isPrime = true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                isPrime = false;
            }
        }
        return isPrime;

    }
    
    public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number upto which you wnt to print prime number");
            int n = sc.nextInt();
            for (int i=2;i<=n;i++){
            if (isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        sc.close();
    }

    }
    

