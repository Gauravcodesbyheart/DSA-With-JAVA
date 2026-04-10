import java.util.Scanner;

public class QuickSortCode {
    public static void quickSort(int arr[], int si, int ei){
        if (si>=ei){   // terminating condition
            return;
        }
        int pIdx=partition(arr,si,ei);  // finding the index of the pivot element
        quickSort(arr,si,pIdx-1);        // sort the left part 
        quickSort(arr,pIdx+1,ei);        // sort the right part 
    }
    public static int partition(int arr[], int si, int ei){
        // make end element as the pivot 
        int pivot=arr[ei];
        int i=si-1;    // keep the starting index as the -ve 
        for(int j=si;j<=ei-1;j++){     // using the poimnter point at the starting index of the array 
            if(arr[j]<=pivot){         // if element is less than the pivot  increase the index and swap the  elemnts 
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;             // now do same for finding the position of the pivot 
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;  
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the unsorted elements of the array: ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The unsorted elements of the array are : ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        quickSort(arr, 0, arr.length-1);
        System.out.println("The Sorted elements of the array after doing quick sort are : ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();


    }
}
