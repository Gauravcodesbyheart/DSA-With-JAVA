import java.util.*;
public class printreverseofnumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numberfor which you want to reverse the number");
        int n = sc.nextInt();
        while (n!=0){
            int ld = n%10;
            System.out.print(ld);
            n = n/10;
        }
        sc.close();

    }
}
