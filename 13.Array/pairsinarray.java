import java.util.*;
public class pairsinarray {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the elements of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the original array are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println("The pairs of the elements of the array are: ");
        for (int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+"");
            }
        System.out.println();
        }
        sc.close();
    }
    
}

