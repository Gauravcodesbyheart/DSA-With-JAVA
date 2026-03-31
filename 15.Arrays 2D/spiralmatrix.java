import java.util.*;
public class spiralmatrix {
    public static void spiralmatrixprinting(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int startrow=0;
        int startcolumn=0;
        int endrow=n-1;
        int endcolumn=m-1;
        while(startrow<=endrow && startcolumn<=endcolumn){
            //top
            for (int j=startcolumn;j<=endcolumn;j++){
                System.out.print(arr[startrow][j]+" ");
            }
            //Right
            for(int i=startrow+1;i<=endrow;i++){

                System.out.print(arr[i][endcolumn]+" ");
            }

            // 🔹 3. BOTTOM (right → left)
            // IMPORTANT: check to avoid duplicate row printing
            if (startrow < endrow) {
                for (int j = endcolumn - 1; j >= startcolumn; j--) {
                    System.out.print(arr[endrow][j] + " ");
                }
            }
            //left
            // 🔹 4. LEFT (bottom → top)
            // IMPORTANT: check to avoid duplicate column printing
            if (startcolumn < endcolumn) {
                for (int i = endrow - 1; i > startrow; i--) {
                    System.out.print(arr[i][startcolumn] + " ");
                }
            }
            startrow++;
            startcolumn++;
            endrow--;
            endcolumn--;
        }
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
        spiralmatrixprinting(arr);
        sc.close();
    }
    
}
