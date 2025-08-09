import java.util.*;
public class invertedandrotatedhalfpyramid {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = sc.nextInt();
        for (int i=1;i<=row;i++){
                for (int space = 1; space<=row-i;space++){
                    System.out.print("");
                }
                for (int star = 1;star<=i;star++){
                    System.out.print("*");
                }
            System.out.println(" ");
        }
        sc.close();
    }
}
