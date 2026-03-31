import java.util.*;
public class transposeofmatrix {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the no. of columns of the array: ");
        int m=sc.nextInt();
        int matrix[][]=new int [n][m];
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
        int transposematrix[][]=new int [m][n];
        for (int i=0;i<=n-1;i++){
            for (int j=0;j<=m-1;j++){
                transposematrix[j][i]=matrix[i][j];
            }     
        }
        
        System.out.println("The elements of the transpose matrix are: ");
        for (int i=0;i<=transposematrix.length-1;i++){
            for (int j=0;j<=transposematrix[0].length-1;j++){
                System.out.print(transposematrix[i][j]+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
