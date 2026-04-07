import java.util.*;
public class PrintAllIndices {

    public static void AllOccurences(int arr[], int key, int si){
        if(si>arr.length-1){ // terminating condition
            return;
        }
        if(key==arr[si]){             // key function
            System.out.print(si+" ");
            AllOccurences(arr, key, si+1);
        }
        AllOccurences(arr, key, si+1);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the element which all indices you wan to find: ");
        int key=sc.nextInt();
        AllOccurences(arr, key, 0);
        sc.close();
    }
}
