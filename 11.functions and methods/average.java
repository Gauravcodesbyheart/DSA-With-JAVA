import java.util.*;
    public class average{
        public static double averagenum(double x,double y,double z){
            return (x+y+z)/3;
    }

public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number.");
    double x = sc.nextDouble();
    System.out.println("Enter the second number.");
    double y = sc.nextDouble();
    System.out.println("Enter the third number.");
    double z = sc.nextDouble();
    double result = averagenum(x,y,z);
    System.out.println("Average of two numbers is "+result);
    sc.close();
    }
}
