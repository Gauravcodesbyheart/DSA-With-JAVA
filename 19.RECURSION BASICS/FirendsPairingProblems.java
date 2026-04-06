import java.util.*;
public class FirendsPairingProblems {
    public static int FriendsPair(int n){
        if ( n==1|| n==2){
            return n;
        }
        int singleways=FriendsPair(n-1);
        int pairways=(n-1)*FriendsPair(n-2);
        int totalways=singleways+pairways;
        return totalways;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends:");
        int n=sc.nextInt();
        int result=FriendsPair(n);
        System.out.println(result+" ");
        sc.close();
    }
}
