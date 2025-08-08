import java.util.*;
public class makethebill {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of the pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of the Eraser");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println(total+"is the total price of the items purchased.");
        float aftertax = (total + (total*0.18f));
        System.out.println("The total price after applying the gst of 18 % is "+aftertax);
        sc.close();
    }  
}
