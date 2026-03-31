import java.util.Scanner;
public class sumofdiagonalelementsof2darray {
    public static int sumofdiagonalementscomplexityn(int arr[][]){
        int sum=0;
        for (int i=0;i<=arr.length-1;i++){
            //pd
            sum+=arr[i][arr.length-1-i];
            //sd
            if(i!=arr.length-1-i){
                sum+=arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static int sumofdiagonalementscomplexitynsquare(int arr[][]){
        int sum=0;
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr[0].length-1;j++){
                if (i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==arr.length-1){
                        sum+=arr[i][j];
                    }
                }
            }
        return sum;
        }
     public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows in the 2-d array: ");
        int n=sc.nextInt();
        System.out.println ("Enter the no. of column of the 2-d array: ");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        System.out.println("Enter the Elements of the array: ");
        for (int i=0;i<=n-1;i++){
            
            for (int j=0;j<=m-1;j++){
                System.out.println("Enter the elment: ("+i+","+j+")");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Elements of the array are: ");
        for (int i=0;i<=n-1;i++){
            for (int j=0;j<=m-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("The sum of the diagonal elements of the array are: "+sumofdiagonalementscomplexitynsquare(arr));
        System.out.println("The sum of the diagonal elements of the array are: "+sumofdiagonalementscomplexityn(arr));
        sc.close();
    }
    
}

