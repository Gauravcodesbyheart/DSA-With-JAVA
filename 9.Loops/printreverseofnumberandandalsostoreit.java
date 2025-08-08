import java.util.*;
public class printreverseofnumberandandalsostoreit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse");
        int n = sc.nextInt();
        int reverse = 0;
        int i = n;  // this is for the printitn number which we want to reverse after the loop vanish as we already divided the value n consecutively 
        while(n!=0){
            int ld = n % 10;
            reverse = reverse*10+ld;
            n = n/10;
        }
        sc.close();
        System.out.println("The reverse of the number "+i+" is "+reverse);

    }
}
