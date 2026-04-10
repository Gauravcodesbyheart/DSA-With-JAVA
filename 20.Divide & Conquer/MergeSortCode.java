import java.util.*;
public class MergeSortCode{

    public static void mergeSort(int arr[], int si, int ei){
        if (si>=ei){   // terminationg condition
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr,si,mid);  // left part of the array
        mergeSort(arr, mid+1,ei);// right part of the array
        merge(arr,si,mid,ei);   // merge the both of the parts
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1]; /// temp array to store the sorted part of the array
        int i=si;   // start of the left part 
        int j=mid+1; // start of the right part 
        int k=0;     // index of the temp array

        // Compare smaller elements and store compare among the both parts that is in left and right and those elements whose smaller then the pther store it and increse the index and the index of k each time increses 
        while(i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for left over elements of the 1st sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
         // for left-over elements of the sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy temp to the original array 
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
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
        mergeSort(arr, 0, arr.length-1);
        System.out.println("");
        System.out.println("The Sorted elements of the array after doing merge sort are : ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();


    }
}