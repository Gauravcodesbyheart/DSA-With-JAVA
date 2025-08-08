import java.util.*;
public class preactise1_positiveornegative {
    public static void main (String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            System.out.println("The number is the positive number");
        }
        else {
            System.out.println("The number is the negative number");
        }
         sc.close();


    }

    
}
