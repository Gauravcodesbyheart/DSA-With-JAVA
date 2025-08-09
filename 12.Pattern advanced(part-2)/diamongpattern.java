import java.util.*;
public class diamongpattern {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int space = 1;space<=row-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=row-1;i>=1;i--){
            for (int space = 1;space<=row-i;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
}
