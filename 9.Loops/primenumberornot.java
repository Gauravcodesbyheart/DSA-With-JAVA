import java.util.*;
public class primenumberornot {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find either it is prime or not");
        int n = sc.nextInt();
        int i = 2;
        if (n==2){
            System.out.println(n+" is the prime number");
        }
        else{
            boolean isprime = true;
            for (i=2;i<=n-1;i++){
                if (n%i==0){
                    isprime = false;
                }
            }
            sc.close();
            if (isprime==true){
                System.out.println(n+" is prime");
            }
            else{
                System.out.println(n+" is not prime number");
            }
        }
        

    }
    
}
