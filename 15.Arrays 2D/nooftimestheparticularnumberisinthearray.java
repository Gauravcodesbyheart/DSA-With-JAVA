import java.util.*;
public class nooftimestheparticularnumberisinthearray {

    public static int frequency(int matrix[][], int key){
        int freq=0;
        for(int i=0;i<=matrix.length-1;i++){
            for (int j=0;j<=matrix[0].length-1;j++){
                if (key==matrix[i][j]){
                    freq++;
                }
            }
        }
        return freq;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter no. of columns of the array: ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<=n-1;i++){
            for (int j=0;j<=m-1;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the array: ");
        for (int i=0;i<=n-1;i++){
            for (int j=0;j<=m-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Enter the number which frequency you want to know: ");
        int key = sc.nextInt();
        int result=frequency(matrix,key);
        if (result>0){
            System.out.println("The elements is present in the array"+result+ "times.");
        }
        else{
            System.out.println("The elements is not present in the array.");
        }
        sc.close();
    }
}
