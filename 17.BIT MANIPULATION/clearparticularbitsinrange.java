import java.util.*;
public class clearparticularbitsinrange{
    public static int clearbitsinrange(int n, int i,int j){
        int a = ((~0) << (j+1));
        int b = (1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;
    }
    public static void main (String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n=sc.nextInt();
        System.out.println("Enter the starting bit position: ");
        int i=sc.nextInt();
        System.out.println("Enter the ending bit position: ");
        int j=sc.nextInt();
        System.out.println(clearbitsinrange(n,i,j)+" is the updated number after changing the bits.");
        sc.close();
    }
    
}