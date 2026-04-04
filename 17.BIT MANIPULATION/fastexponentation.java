import java.util.*;
public class fastexponentation {
    public static int fastexpo(int a,int n){
        int ans=1;
        while(n>0){
            if ((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int a=sc.nextInt();
        System.out.println("Enter the exponent: ");
        int n=sc.nextInt();
        System.out.println("The number after calculating the final exponent is: "+fastexpo(a,n));
        sc.close();
    }
    
}
