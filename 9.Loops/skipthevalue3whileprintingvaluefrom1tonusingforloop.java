import java.util.*;
public class skipthevalue3whileprintingvaluefrom1tonusingforloop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number uto which you want to print value");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
