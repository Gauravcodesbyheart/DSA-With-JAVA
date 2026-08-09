public class Permutation {

    public static void findPermutation(String str, String ans) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Choose every character one by one
        for (int i = 0; i < str.length(); i++) {

            // Character chosen
            char curr = str.charAt(i);

            // Remaining string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String args[]) {

        String str = "ABC";

        findPermutation(str, "");
    }
} 