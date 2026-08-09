import java.util.*;
public class maximumnum {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(25);
        list.add(89);
        list.add(55);
        list.add(100);
        list.add(8);
        list.add(9);
        int max=Integer.MIN_VALUE;
        for (int i=0;i<list.size();i++){
            if (max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println("The greatest element in the list is "+max);
    } 
}
