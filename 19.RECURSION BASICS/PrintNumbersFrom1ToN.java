import java.util.*;

public class PrintNumbersFrom1ToN {
    public static void OneToN(int n) {
        if (n == 0) {
            return;
        }
        OneToN(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int n = sc.nextInt();
        System.out.println("The Numbers from 1 to " + n + " is: ");
        OneToN(n);
        sc.close();
    }
}
