import java.util.*;
public class factorial {
    public static int factorailofnum(int n ){
        int f = 1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Factorail of "+n+" is :"+factorailofnum(n));
        sc.close();
    }
    
}
