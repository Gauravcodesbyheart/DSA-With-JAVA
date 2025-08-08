import java.util.*;
public class dectobin {
    public static int binarynum(int n){
        int bin = 0;
        int power = 0;
        while (n>0){
            int rem = n % 2;
            bin =(int) (bin + rem*Math.pow(10,power));
            n  = n /2;
            power++;
    }
    return bin ;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = sc.nextInt();
        int result = binarynum(n);
        System.out.println("Binary number of "+n+" is "+result);
        sc.close();

    }
}
