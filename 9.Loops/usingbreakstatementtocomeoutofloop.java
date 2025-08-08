import java.util.*;
public class usingbreakstatementtocomeoutofloop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter the number");
             n = sc.nextInt();
            if (n%10==0){
                break;
            }
        
        }
        while(true);
        System.out.println(n+"This number is the multiple of 10");
        sc.close();


    }
}
