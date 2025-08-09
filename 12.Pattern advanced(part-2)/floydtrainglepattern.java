import java.util.*;
public class floydtrainglepattern {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = sc.nextInt();
        System.out.println("There is your result Mr. Gaurav Singh");
        int num = 1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
