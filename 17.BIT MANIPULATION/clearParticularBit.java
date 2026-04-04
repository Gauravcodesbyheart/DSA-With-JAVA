import java.util.*;
public class clearParticularBit {
    public static int clearIthBit(int n , int i){
        int bitMask= ~(1<<i);
        return n & bitMask;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n=sc.nextInt();
        System.out.println("Enter the Ith bit for the number: ");
        int i=sc.nextInt();
        System.out.println(clearIthBit(n,i)+" is the final number after clearing the said bit.");
        sc.close();
    }
    
}
