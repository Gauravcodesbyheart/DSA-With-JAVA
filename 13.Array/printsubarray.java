import java.util.*;
public class printsubarray {
    public static void printsubarrayofnumbers(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            int start = i;
            for (int j=i;j<=arr.length-1;j++){
            int end = j;
                for (int k=start;k<=end;k++){
                    System.out.print(arr[k]+"");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+"");

        }
        System.out.println("The sub array of the given array is : ");
        printsubarrayofnumbers(arr);
        sc.close();
    }
    
    
}
