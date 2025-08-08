import java.util.*;
public class areaofcircle {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r = sc.nextInt();
        float area = 3.14f * r * r;
        System.out.print("The area of the circle is ");
        System.out.println(area); 
        // type conversion
        int a = 10;
        long b = a;
        System.out.println(b);
        // Type casting
        int c = 5;
        long d = (int)c;
        System.out.println(d);
        sc.close();
        // type promotion -- when byte,short,char is given in the code and these are the parts of the 
        // expression then all data type converted to the int data type
        char x = 'x';
        char y = 'y';
        System.out.println((int)(x));
        System.out.println((int)(y));
        sc.close();

    }
}

