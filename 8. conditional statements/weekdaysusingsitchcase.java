import java.util.*;
public class weekdaysusingsitchcase {
    public static void main (String args[]){
        System.out.println("Enter the day of the int he number");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch(week){
            case 1:
            System.out.println("Sunday");
            case 2:
            System.out.println("Monday");
            case 3:
            System.out.println("Tuesday");
            case 4:
            System.out.println("Wednesday");
            case 5:
            System.out.println("Thursday");
            case 6:
            System.out.println("Friday");
            case 7:
            System.out.println("Saturday");

        }
        sc.close();
    }

    
}
