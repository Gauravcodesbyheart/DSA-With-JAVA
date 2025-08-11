import java.util.*;
public class duplicatearraylement {
    public static boolean duplicatefinder(int arr[]){
        boolean duplicate = false;
        for (int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if (arr[i]==arr[j]){
                    duplicate = true;
                }

            }
        }
        
        return duplicate;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[] = new int [n];
        for (int i=0;i<=n-1;i++){
            System.out.println("Enter the elements of the array: ");
            arr[i]=sc.nextInt();
        }
        boolean result = duplicatefinder(arr);
        System.out.println(result+" ");
        sc.close();

    }
    
}
