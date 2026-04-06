import java.util.*;
public class power {
    public static int fastPower(int base, int exponent) {  // optimized power function
    if (exponent == 0) return 1;  

    int half = fastPower(base, exponent / 2);

    if (exponent % 2 == 0) {
        return half * half;
    } else {
        return base * half * half;
    }
}
    public static int powers(int base, int exponent){
        if (exponent==0){
            return 1;
        }
        else{
            return base*powers(base,exponent-1);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base=sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent=sc.nextInt();
        int result=powers(base,exponent);
        System.out.println(result+" is the result when "+base+" raised to the exponent"+exponent);
        int result1=fastPower(base,exponent);
        System.out.println(result1+"is the result using the fast exponet.");
        sc.close();
    }    
}
