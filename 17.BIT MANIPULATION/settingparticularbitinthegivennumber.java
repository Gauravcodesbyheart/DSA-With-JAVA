import java.util.*;
public class settingparticularbitinthegivennumber {
    public static int setIthBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask ;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n=sc.nextInt();
        System.out.println("Enter the ith bit you want to set: ");
        int i=sc.nextInt();
        System.out.println("After setting the ith bit the final number is: "+setIthBit(n,i));
        sc.close();
    }
}
