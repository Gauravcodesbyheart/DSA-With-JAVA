import java.util.*;
public class countsetbitsinabinarynumber {
    public static int countnoofsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count++;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n=sc.nextInt();
        int result=countnoofsetbits(n);
        System.out.println("The no. of set bits in the number is "+result);
        sc.close(); 
    }
    
}
