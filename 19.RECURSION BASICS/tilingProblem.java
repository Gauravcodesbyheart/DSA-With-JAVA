import java.util.*;
public class tilingProblem {
    public static int TilingProblems(int n){             // 2 X n is the size of the fllor
        if (n==0|| n==1){
            return 1;
        }
        int verticalways=TilingProblems( n-1);
        int horizontalways=TilingProblems(n-2);
        return verticalways+horizontalways;
    }       
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n which is the breadth of the floor: ");
        int n=sc.nextInt();
        System.out.println(TilingProblems(n)+" is the no. of ways to arrange the tile in the floor.");
        sc.close();
    }
}
