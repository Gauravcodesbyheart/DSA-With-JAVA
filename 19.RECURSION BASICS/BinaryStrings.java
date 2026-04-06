import java.util.*;
public class BinaryStrings {
    public static void BinaryString(int n, int lastplace, String Sb){
        if (n==0){
            System.out.println(Sb+" ");  // base condition
            return;
        }
        BinaryString(n-1, 0, Sb+"0");  // work condition if last digit is 0 
        if (lastplace==0){ // last place me zero hoga tb hi one bitha sakte h thats why check conditiomn of last place = 0
            BinaryString(n-1, 1, Sb+"1");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the string: ");
        int n=sc.nextInt();
        BinaryString(n,0,"");
        sc.close();
    }
}
