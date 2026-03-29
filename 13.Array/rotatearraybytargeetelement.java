import java.util.*;
public class rotatearraybytargeetelement {
    public static void rotatethearray(int arr[], int target){
    int pivot= -1;
    int n=arr.length;
    for (int i=0;i<=n-1;i++){
        if (target==arr[i]){
            pivot = i;  // finding the index of the number 
            break;
        }
    }
    if (pivot == -1) {
            System.out.println("Target not found in array");  // if number not found in the array 
            return;
    }
    int arrnew[] = new int[n];
    for (int i = 0;i<=n-1;i++){        
        arrnew[i] = arr[(pivot+i)%n];            // storing the value in the new array
    }
        for (int i = 0;i<=arr.length-1;i++){
        System.out.println(arrnew[i]+"");             // print the updated array value.
    } 
    }

    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array in the ascending order: ");
        for (int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for (int i=0;i<=n-1;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println("Enter the element by which you want to rotate the array: ");
        int target = sc.nextInt();
        System.out.println("After rotating the array the final array will be : ");
        rotatethearray(arr,target);
        sc.close();
    }
    
}
