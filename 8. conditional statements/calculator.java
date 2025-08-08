import java.util.*;
public class calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first operand:");
        int a = sc.nextInt();
        System.out.println("Enter the operator:");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the second operand:");
        int b = sc.nextInt();
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
        }
        sc.close();
    }
}
