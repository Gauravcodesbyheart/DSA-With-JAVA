import java.util.*;
public class clearLastIBits {
    public static int clearIBits(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n=sc.nextInt();
        System.out.println("Enter the ith bit upto which you want to clear last bits: ");
        int i=sc.nextInt();
        clearIBits(n,i);
        sc.close();

    }
}
