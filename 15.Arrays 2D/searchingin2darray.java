import java.util.*;
public class searchingin2darray{

    public static boolean searching(int arr[][],int key){
        boolean ispresent=false;
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr[0].length-1;j++){
                if (key==arr[i][j]){
                    ispresent=true;
                    System.out.println("The element is present in the array at: ("+i+","+j+")");
                }
            }
        }
        if (!ispresent) System.out.println("The elements is not present in the array");
        return ispresent;
        
    }
    public static void main (String args[]){
        int matrix [][]=new int [3] [3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<=matrix.length-1;i++){
            for (int j=0;j<=matrix.length-1;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array: ");
        for (int i=0;i<=matrix.length-1;i++){
            for (int j=0;j<=matrix.length-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        searching(matrix,5);
        sc.close();

    }
}