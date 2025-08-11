import java.util.*;
public class arrayinput {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter the marks of the subject: "+(i+1)+" is ");
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.println("The marks of the subject: "+(i+1)+" is "+marks[i]);
        }
    sc.close();
    }
}
