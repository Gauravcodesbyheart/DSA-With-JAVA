import java.util.*;
public class maxsubarraysumbruteforce {
    public static void bruteforcemaxsubarray(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        for (int i=0;i<=arr.length-1;i++){
            int start = i;
            for (int j=i;j<=arr.length-1;j++){
                int end = j;
                int currsum = 0;
                for (int k=start;k<=end;k++){
                    currsum+=arr[k];                    
                }
                System.out.println(currsum+"");
                if (maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("Max sum = "+maxsum);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<=n-1;i++){
            System.out.println("Enter the element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the original array are: ");
        for (int i=0;i<=n-1;i++){
            System.out.println(arr[i]+"");
        }
        bruteforcemaxsubarray(arr);

        sc.close();
    }
    
}
