import java.util.*;
public class nooftimesvoewlsinthestring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want: ");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("The no. of times the vowels appears in the string is: "+count);
        sc.close();
    }
    
}
