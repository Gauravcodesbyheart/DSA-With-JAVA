public class GridWays {

    public static int gridWays(int i, int j, int n, int m) {

        // Base Case 1
        // Destination reached
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Base Case 2
        // Outside the grid
        if (i == n || j == m) {
            return 0;
        }

        // Move Down
        int down = gridWays(i + 1, j, n, m);

        // Move Right
        int right = gridWays(i, j + 1, n, m);

        // Total ways
        return down + right;
    }

    public static void main(String args[]) {

        int n = 3;
        int m = 3;

        System.out.println(gridWays(0, 0, n, m));
    }
}