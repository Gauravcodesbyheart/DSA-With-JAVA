import java.util.*;
public class averageofthreenumbers {
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number\n");
    int a = sc.nextInt();
    System.out.println("Enter the second number");
    int b = sc.nextInt();
    System.out.print("Enter the third number\n");
    int c = sc.nextInt(); 
    int sum = a + b + c ;
    int avg = sum / 3;
    System.out.println("The average of the three number is ");
    System.out.print(avg);
    sc.close(); 
   } 
}
