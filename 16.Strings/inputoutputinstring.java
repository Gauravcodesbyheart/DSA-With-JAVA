import java.util.*;
public class inputoutputinstring {
   public static void main (String args[]){
    char arr[]={'a','b','c','d'};
    String str1="abcd";
    String str2=new String ("XYZ"); 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name=sc.nextLine();
    System.out.println("The name of the students is : "+name);
    System.out.println(arr);
    System.out.println("The string 1 and string 2 is: "+str1+" and "+str2);
    System.out.println("The length of the name is: "+(name.length()-1));
    sc.close();
   } 
}
