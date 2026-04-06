import java.util.*;
public class PrintNumbersFrmNto1{
    public static void NTo1(int n){
        if (n==0){
            return;
        }
        System.out.println(n+" ");
        NTo1(n-1);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n=sc.nextInt();
        System.out.println("The Numbers from "+n+ "to 1 is: ");
        NTo1(n);
        sc.close();

    }
}
