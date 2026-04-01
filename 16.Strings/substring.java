import java.util.*;
public class substring {
    public static void main (String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the String of your choice: ");
    String str = sc.nextLine();
    System.out.println("Enter the starting index of the string: ");
    int si=sc.nextInt();
    System.out.println("Enter the ending index of the string: ");
    int ei=sc.nextInt();
    String newstring="";
    for(int i=si;i<=ei;i++){
        newstring+=str.charAt(i);
    }
    System.out.println("The Substring from the "+str+" from index "+si+" to "+ei+" is: "+newstring);
    sc.close();
    }
    
}
