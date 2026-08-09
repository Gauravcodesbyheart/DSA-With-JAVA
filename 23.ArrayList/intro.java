import java.util.*;
public class intro {
   public static void main (String args[]){
    ArrayList <Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.get(1);
    System.out.println("The element at index 1 in array list is "+list.get(1));
    list.remove(0);
    list.set(0,0);
    System.out.println("The element at index 0 in array list is "+list.get(0));
    System.out.println(list.contains(11));
    System.out.println(list.size());
    System.out.println("The elements of the list are: ");
    for (int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
    System.out.println("The elements of the list in reverse order are: ");
    for (int i=list.size()-1;i>=0;i--){
      System.out.println(list.get(i));
    }

   } 
}
