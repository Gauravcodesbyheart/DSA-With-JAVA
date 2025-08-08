import java.util.*;
public class incometaxcalculator {
    public static void main (String args[]){
        System.out.println("Enter the income of the person");
        Scanner sc  = new Scanner(System.in);
        int income  = sc.nextInt();
        if (income<500000){
           int tax = income;
           System.out.println("Tax for income of "+income+"is"+tax); 
        }
        else if (income>500000 && income<1000000){
            double tax =(double) income*(0.20); 
            System.out.println("Tax for income of "+income+" is "+tax);
        }
        else {
            double tax =(double) income*(0.30); 
            System.out.println("Tax for income of "+income+"is"+tax);
        }
        sc.close();


    }

    
}
