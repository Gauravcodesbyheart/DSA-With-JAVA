import java.util.*;
public class BacktrackingOnArrays {
    public static void Changearr(int arr[], int i, int val){
        //backtracking
        if (i==arr.length){
            printarr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        Changearr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
        
    }

    public static void printarr(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
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
            System.out.print(arr[i]+" ");
        }
        Changearr(arr,0,1);
        sc.close();
    }
}
