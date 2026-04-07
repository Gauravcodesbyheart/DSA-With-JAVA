public class NumberToWords {

    static String[] words = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    public static void printWords(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;

        // Recursive call
        printWords(n / 10);

        // Print after recursion (to maintain order)
        System.out.print(words[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int n = 1947;
        printWords(n);
    }
}