import java.util.*;
public class stringcompression {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Original String: ");
        String str=sc.next();
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<=str.length()-1;i++){
            Integer count = 1;
            while(i<=str.length()-2 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1){
                sb.append(count.toString());
            }

        }
        System.out.println("The compressed version of the string is"+sb);
        sc.close();
    }    
}
