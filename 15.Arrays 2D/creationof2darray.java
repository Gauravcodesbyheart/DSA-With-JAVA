import java.util.*;
public class creationof2darray{
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
        sc.close();

    }
}