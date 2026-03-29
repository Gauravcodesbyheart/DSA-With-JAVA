import java.util.*;
public class selectionsort{

    public static void selectionsorting(int arr[]){
        for (int i=0;i<=arr.length-2;i++){
            int minindex=i;
            for (int j=i+1;j<=arr.length-1;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            // Swap
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
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
        selectionsorting(arr);
        printarray(arr);
        sc.close();
    }
}
