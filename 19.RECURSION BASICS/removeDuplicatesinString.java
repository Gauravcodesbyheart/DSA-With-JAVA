
import java.util.*;
public class removeDuplicatesinString {
    public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if (idx==str.length()){
            System.out.println(newStr+" ");
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeduplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeduplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of your choice: ");
        String str= sc.next();
        System.out.println("After removing the duplicates the final String is: ");
        removeduplicates(str, 0, new StringBuilder(""), new boolean [26]);
        sc.close();
    }
}
