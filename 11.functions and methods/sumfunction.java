import java.util.*;
public class sumfunction {
    public static int sum (int a, int b){  // function defination , paremeter here used are called formal paramters
        int add = a+b;
        return add;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        sum(a,b);  //values passed here into the function called as function argument 
        sc.close();
    } 
    
}
