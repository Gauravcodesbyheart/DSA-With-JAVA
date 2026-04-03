import java.util.*;

public class anagramdetector {
    public static boolean isAnagram(String s1, String s2) {
        // Step 1: check length
        if (s1.length() != s2.length())
            return false;

        // Step 2: convert to char array
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Step 3: sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: compare
        return Arrays.equals(arr1, arr2);


    }
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
    }

    
}