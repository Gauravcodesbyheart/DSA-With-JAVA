import java.util.*;
public class bintodec{
    public static int decimalnumber(int n){
        int power = 0;
        int dec = 0;
        while (n>0){
            int ld = n % 10;
            dec = (int) (dec+(ld * Math.pow(2,power)));
            power++;
            n = n/10;
        }
        return dec;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n = sc.nextInt();
        int result = decimalnumber(n);
        System.out.println("The decimal of the number "+n+ " is "+result);
        sc.close();
    }
    
}
