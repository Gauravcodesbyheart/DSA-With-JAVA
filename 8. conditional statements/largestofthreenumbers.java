import java.util.*;
public class largestofthreenumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is the greatest number among all three");
        }
        else if (b>c && b>a){
            System.out.println(b+" is the greatest number amonmg all three");
        }
        else if (c>a && c>b){
            System.out.println(c+" is the greatest number among all three");
        }

        sc.close();

    }
}
