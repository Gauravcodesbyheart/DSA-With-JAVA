import java.util.*;
public class passorfailinexam {
    public static void main (String args[]){
        System.out.println("Enter the marks of the student");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks>33)? "Pass": "Fail";
        System.out.println(result); 
        sc.close();
    }
    
}
