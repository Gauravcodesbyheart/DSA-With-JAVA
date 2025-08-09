import java.util.*;
public class palindromepatternwithnumbers {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int space = 1; space<=row-i;space++){
                System.out.print(" ");
            }
            for (int num=i;num>=1;num--){
                System.out.print(num+"");
            }
            for (int num=2;num<=i;num++){
                System.out.print(num+"");
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
