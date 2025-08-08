import java.util.*;
public class leapyearornot {
    public static void main (String args[]){
        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println("Leap year");
        }
        sc.close();


    }
}
