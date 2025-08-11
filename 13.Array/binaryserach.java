import java.util.*;
public class binaryserach {
    public static int searching(int arr[],int key){
        int start = 0,end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (key==arr[mid]){
                return mid;
            }
            if (key<arr[mid]){ // mid ka value bada hai toh mid ko ghtao,left part
                end = mid-1;
            }
            else{
                start = mid+1;   // mid ka value kam hai toh mid ka value ko badhao,right part 
            }
            
        }
        return -1;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {23,45,67,78,90};
        System.out.println("Enter the number you want to search: ");
        int key = sc.nextInt();
        int result = searching(arr, key);
        if (result>0){
        System.out.println("The number is found at index "+result);
        }
        else{
            System.out.println("The number is not found.");
        }
        sc.close();

    }
    
}
