import java.util.*;
public class sortedarray {
    public static boolean isSorted(int n[], int index){
       if (index==n.length-1){
        return true;
       }
       if(n[index]>n[index+1]){
        return false;
       }
       return isSorted(n,index+1);
           
}
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the element: ");
    int n=sc.nextInt();
    int arr[]= new int [n];
    System.out.println("Enter the elements of the array: ");
    for (int i=0;i<=n-1;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("The elements of the array are: ");
    for (int i=0;i<=n-1;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
    boolean result = isSorted(arr,0);
    if(result==true){
        System.out.println("The array is sorted.");
    }
    else{
        System.out.println("The array is not sorted.");
    }
    sc.close();
    }    
}
