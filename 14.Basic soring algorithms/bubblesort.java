import java.util.*;
public class bubblesort{

    public static void bubblesorting(int arr[]){
        for (int i=0;i<=arr.length-2;i++){
            boolean isswapped=false;
            for (int j=0;j<=arr.length-2-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isswapped=true;
                }
            }
            if (!isswapped) break;
        }
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
        bubblesorting(arr);
        sc.close();
    }
}