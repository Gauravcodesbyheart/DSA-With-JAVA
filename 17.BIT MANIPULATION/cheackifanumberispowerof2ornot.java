import java.util.*;
public class cheackifanumberispowerof2ornot {
    public static void checknoisinpoweroftwoornot(int n){
        if ((n & n-1 )==0){
            System.out.println("The number is in the form of power of 2.");
        }
        else{
            System.out.println("The number you entered is not in the form of power of 2.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to identify either it can be expressed in the power of 2 or not: ");
        int n = sc.nextInt();
        checknoisinpoweroftwoornot(n);
        sc.close();      
    }
}
