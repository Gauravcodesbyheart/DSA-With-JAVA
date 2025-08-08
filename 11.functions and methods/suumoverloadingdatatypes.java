import java.util.*;
public class suumoverloadingdatatypes {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Sum of two integer number is : "+sum(2,5));
        System.out.println("Sum of two float number is :"+sum(6.09f,4.56f));
        sc.close();
        

    }
    
}
