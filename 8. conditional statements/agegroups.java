import java.util.*;
public class agegroups {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Adult");
        }
        else if( age<18 && age>=13){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
        sc.close();

    }
    
}
