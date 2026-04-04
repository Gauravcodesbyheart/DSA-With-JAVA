import java.util.*;
public class gettingparticularbit {
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if ((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n=sc.nextInt();
        System.out.println("Enter the i th bit you want to know in the given number i.e, "+n);
        int i=sc.nextInt();
        int result = getIthBit(n,i);
        System.out.println("The ith bit in the given number is "+result);
        sc.close();
    }
}
