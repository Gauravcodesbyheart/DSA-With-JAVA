import java.util.*;
public class updateparticularbit {
    public static int updateIthBit(int n, int i, int newBit){
        if (newBit==0){
            return n & ~(1<<i);
        }
        else{
            return n | (newBit<<i);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of your choice: ");
        int n=sc.nextInt();
        System.out.println("Enter the ith bit which you want to update: ");
        int i=sc.nextInt();
        System.out.println("Enter the bit with which you want to update: ");
        int newBit=sc.nextInt();
        System.out.println(updateIthBit(n,i,newBit)+" is the updated number.");
        sc.close(); 
    }
}
