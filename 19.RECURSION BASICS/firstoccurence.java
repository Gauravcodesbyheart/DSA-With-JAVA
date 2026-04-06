import java.util.Scanner;
public class firstoccurence {

    public static int firstappearance(int arr[], int key, int startIndex){
        if(startIndex>arr.length-1){
            return -1;
        }
        if (arr[startIndex]!=key){
            return firstappearance(arr, key, startIndex+1);
        }
        else{
            return startIndex;
        }
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
    System.out.println("Enter the element which you want to find in the array: ");
    int key = sc.nextInt();     
    System.out.println(key+" is found first at the index"+firstappearance(arr, key,0));
    sc.close();
    }
}
