import java.util.*;
public class maxsubarraykadane {
    public static void kadane (int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i=0;i<=arr.length-1;i++){
            currsum = currsum+arr[i];
            if (currsum<0){
                currsum=0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Our max subarray sum is : "+maxsum);

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
        sc.close();
        

    }

    
}
