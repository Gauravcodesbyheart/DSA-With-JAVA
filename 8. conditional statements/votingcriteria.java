import java.util.*;
public class votingcriteria {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        if (age>18){
            System.out.println("Able to Vote");
        }
        else{
            System.out.println("Can't Vote");
        }
        sc.close();
    }
    
}
