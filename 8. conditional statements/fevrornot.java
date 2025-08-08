import java.util.Scanner;
public class fevrornot {
    public static void main (String args[]){
        System.out.println("Enter the Terperature recorded in the theermometer");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp>100){
            System.out.println("The Person is suffering from the fever");
        }
        else {
            System.out.println("The Person is not suffering from the fewer");
        }
         sc.close();
    
}
}
