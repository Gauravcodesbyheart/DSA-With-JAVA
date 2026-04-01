import java.util.*;
public class Stringconcatenation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of the student: ");
        String firstName = sc.next();
        System.out.println("Enter the last name of the student: ");
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;
        System.out.println("The full name of the Student is " + fullName);
        System.out.println("The first letter of the string is:"+fullName.charAt(0)); 
        System.out.println("The Full name of the string using the loop is: ");
        System.out.println("The length of the string is: "+fullName.length());
        for(int i=0;i<=fullName.length()-1;i++){
            System.out.print(fullName.charAt(i));
        }
        sc.close();
    }
}
