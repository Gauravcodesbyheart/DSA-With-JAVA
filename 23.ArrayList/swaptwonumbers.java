import java.util.*;
public class swaptwonumbers {

    public static void swap(ArrayList <Integer> list , int idx1 , int idx2 ){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    } 
    public static void main (String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("The elements of the ArrayList before Swapping are: ");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        int idx1=1;
        int idx2=3;
        swap(list,idx1,idx2);
        System.out.println("The elements of the ArrayList after Swapping position with index "+idx1+" and "+idx2+" are: ");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
