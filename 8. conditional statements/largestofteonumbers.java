import java.util.*;
public class largestofteonumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a+":Largest number");
        }
        else{
            System.out.println(b+":Largest number");
        }
        sc.close();
    } 
}
