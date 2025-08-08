import java.util.*;
public class pq_4multiplicationtableofnumbern {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the multiplication table"); 
        int n= sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
        sc.close();



    }
}
