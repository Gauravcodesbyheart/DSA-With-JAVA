import java.util.*;
public class largestinarray {
    public  static int largestelement(int marks[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<=marks.length-1;i++){
            if (largest<marks[i]){
                largest=marks[i];
            }
        }
        return largest;

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        for (int i=0;i<=marks.length-1;i++){
            System.out.println("Enter the element of the array.");
            marks[i]= sc.nextInt();
        }
        int result = largestelement(marks);
        System.out.println("The largest element of the array is "+result);
        sc.close();

    }
}
