import java.util.*;
public class linearsearch{
    public static int linearsearching(int marks[],int key){
        int position = -1;
        for (int i=0;i<=marks.length-1;i++){
            if (marks[i]==key){
                position = i;
            }
        }
        return position;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int marks [] = new int[n];
        for (int i=0;i<=marks.length-1;i++){
            System.out.println("Enter the marks in the array: ");
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the key value you want to search in the array.");
        int key = sc.nextInt();
        int result = linearsearching(marks,key);
        if (result>0){
            System.out.println("Element is found at index"+result+"and the position is "+(result+1));
        }
        else{
            System.out.println("Elemenet is not avialable in the array.");
        }
        sc.close();
    }
}
