import java.util.*;
public class maxsubarrayprefixsum {
    public static void maxsubarrayprefixsumofelementsofarray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        prefix[0]=arr[0];
        for (int i=1;i<=prefix.length-1;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i=0;i<=arr.length-1;i++){
            int start =i;
            for (int j=i;j<=arr.length-1;j++){
            int end = j;
                currsum = start==0? prefix[end]: prefix[end]-prefix[start-1];
                if (maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("Enter the element of the array: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The elmenets of the original array are: ");
        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
        maxsubarrayprefixsumofelementsofarray(arr);
        sc.close();
    }
    
}
