import java.util.*;
public class insertionsort{

    public static void insertionsorting(int arr[]){
          for (int i=1;i<=arr.length-1;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct position to insert
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }            
    }
    public static void printarray(int arr[]){
        System.out.println("The elements of the array after sorting are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        insertionsorting(arr);
        printarray(arr);
        sc.close();
    }
}
