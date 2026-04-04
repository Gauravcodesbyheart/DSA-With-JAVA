import java.util.*;

public class evenorodd{
    public static void evenodd(int n){
        int bitMask=1;
        if ((n & bitMask)==0){
            System.out.println(n+" is even number.");
        }
        else{
            System.out.println(n+" is odd number.");
        }
    }
public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number you want: ");
    int n=sc.nextInt();
    evenodd(n);
    sc.close();
}
}