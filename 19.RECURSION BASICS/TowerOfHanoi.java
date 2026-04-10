import java.util.*;
public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String source, String helper, String destination) {

        // Base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to helper
        towerOfHanoi(n - 1, source, destination, helper);

        // Step 2: Move nth disk
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from helper to destination
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number of disks :");
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
        sc.close();
    }
}