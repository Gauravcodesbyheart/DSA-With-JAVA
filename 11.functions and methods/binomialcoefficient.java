import java.util.*;
public class binomialcoefficient {
    public static int factorial(int n){
        int f= 1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;

    }
    public static int binomialcalculate(int n,int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);
        int coefficient = nfact/(rfact*nmrfact);
        return coefficient;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int result = binomialcalculate(n,r);
        System.out.println("The Binomial coefficient of the given number is : "+result);
        sc.close();
        
    }
    
}
