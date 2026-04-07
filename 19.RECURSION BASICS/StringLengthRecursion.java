public class StringLengthRecursion {

    public static int length(String str) {
        // Base case
        if (str.equals("")) {
            return 0;
        }

        // Recursive case
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "recursion";
        System.out.println(length(str));
    }
}