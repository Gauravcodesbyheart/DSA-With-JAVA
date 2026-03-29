// for the sorting of array inbuilt library
// for the sorting of the array in the reverse order inbuilt library
import java.util.*;
public class inbuiltsorting {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        Integer array[]={5,6,12,3,7,9,0};
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println("The elements of the array after fully sorting are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
        Arrays.sort(array,0,3);
        System.out.println("The elements of the array after partial sorting are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(array[i]+" ");
        }
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("The elements of the array after fully sorting in reverse order are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(array[i]+" ");
        }
        Arrays.sort(array,1,5,Collections.reverseOrder());
        System.out.println("The elements of the array after partial sorting in reverse order are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(array[i]+" ");
        }
        sc.close();
    }
}
