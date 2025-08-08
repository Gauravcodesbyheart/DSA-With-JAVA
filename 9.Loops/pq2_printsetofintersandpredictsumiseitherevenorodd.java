import java.util.*;
public class pq2_printsetofintersandpredictsumiseitherevenorodd {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int n;
        int evensum=0;
        int oddsum=0;
        do {
            System.out.println("Enter the number");
             n = sc.nextInt();
        if (n%2==0){
             evensum = evensum + n;
        }
        else{
             oddsum = oddsum+ n;
        }
        System.out.println("Do you wish to continue?\nEnter\n1.Continue\n2.Discontinue"); 
        choice = sc.nextInt();      
    }
    while(choice!=2);
        sc.close();
        System.out.println(evensum+" is the sum of even numbers");
        System.out.println(oddsum+" is the sum of all odd numbers");

    }
}
