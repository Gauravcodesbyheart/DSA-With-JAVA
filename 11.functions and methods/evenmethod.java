import java.util.*;
public class evenmethod {
    public static boolean isEven(int n){
        boolean isEven = true;
        if (n%2==0){
            isEven = true;
        }
        else{
            isEven = false;
        }
        return isEven;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (isEven(n)){
            System.out.println(n+" is even number.");
        }
        else{
            System.out.println(n+" is oddd number.");
        }
        sc.close();
    }
}
