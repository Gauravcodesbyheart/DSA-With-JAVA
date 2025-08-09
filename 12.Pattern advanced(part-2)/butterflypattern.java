import java.util.*;
public class butterflypattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int star=1;star<=i;star++){
                System.out.print("*");
            }
            for (int space=1;space<=2*(row-i);space++){
                System.out.print(" ");
            }
            for (int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=row;i>=1;i--){
            for (int star=row;star>=row+1-i;star--){
                System.out.print("*");
            }
            for (int space=1;space<=2*(row-i);space++){
                System.out.print(" ");
            }
            for (int star=row;star>=row+1-i;star--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        
        sc.close();
    } 
 
}
