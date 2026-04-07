public class CountSubstrings {

    public static int countSubstrings(String str, int i, int j) {

        // Base cases
        if (i > j) return 0;

        if (i == j) return 1;

        // Recursive calls
        int res = countSubstrings(str, i + 1, j)
                + countSubstrings(str, i, j - 1)
                - countSubstrings(str, i + 1, j - 1);

        // Check condition
        if (str.charAt(i) == str.charAt(j)) {
            res += 1;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();

        System.out.println(countSubstrings(str, 0, n - 1));
    }
}
