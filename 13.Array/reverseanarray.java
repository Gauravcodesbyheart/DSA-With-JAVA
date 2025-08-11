import java.util.*;
public class reverseanarray {
    public static void reverse(int arr[]){
        int start = 0;
        int last = arr.length-1;
        while(start<=last){
            int temp = arr[start];
            arr[start]= arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of an original array are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The elements of an revershed array are: ");
        reverse(arr);
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+"");
        }
        
        sc.close();
    }
    
}
