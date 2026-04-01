import java.util.*;
public class largeststringbasedonlexicographicorder {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array of strings: ");
        int n=sc.nextInt();
        String str[]=new String[n];
        System.out.println("Enter the elements of the string: ");
        for (int i=0;i<=str.length-1;i++){
            str[i]=sc.next();
        }
        String largest=str[0];
        for(int i=0;i<=str.length-1;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println("As per the lexicographic order "+largest+" is the largest string in the array");
        sc.close();
    }
}
