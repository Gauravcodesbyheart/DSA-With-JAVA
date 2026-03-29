import java.util.*;
public class countingsort{

    public static void countingsorting(int arr[]){
        int largest =0;
        for (int i=0;i<=arr.length-1;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[] =new int [largest+1];
        for (int i=0;i<=count.length-1;i++){
            count[arr[i]]++;
        }
        int j=0;
        for (int i=0;i<=count.length-1;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        
    }
    public static void printarray(int arr[]){
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
        countingsorting(arr);
        printarray(arr);
        sc.close();
    }
}
