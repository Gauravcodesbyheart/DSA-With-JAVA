import java.util.*;

public class shortestdistancechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string indicating the direction: ");
        String direction = sc.next();
        int x=0;
        int y=0;
        for (int i = 0; i <= direction.length() - 1; i++) {
            if (direction.charAt(i)=='n'){
                y++;
            } 
            else if(direction.charAt(i)=='s'){
                y--;
            }
            else if (direction.charAt(i)=='e'){
                x++;
            }
            else{
                x--;
            }         
        }
        
        float distance = (float) Math.sqrt(((x*x)+(y*y)));   //as shortet distance formuls is root under x2-x1 whole square + y2-y1 whole square
        System.out.println("The shortest distance between the initial point and end point is "+distance);
        sc.close();
    }
}
