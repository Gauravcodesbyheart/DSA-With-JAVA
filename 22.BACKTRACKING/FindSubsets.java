import java.util.*;
public class FindSubsets{

    public static void Subsets(String str, String ans ,  int i){
        if (i==str.length()){
            System.out.println(ans);
            return;
        }
        Subsets(str,ans+str.charAt(i),i+1);
        Subsets(str,ans,i+1);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String word: ");
        String str=sc.nextLine();
        System.out.println("The substring of the array are: ");
        Subsets(str,"",0);
        sc.close();
    }
}