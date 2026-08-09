public class NQueens {

    // Function to print the board
    static void printBoard(char board[][]) {
        System.out.println("-------- Chess Board --------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // Check if it is safe to place queen
    static boolean isSafe(char board[][], int row, int col) {

        // Check upper column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1;i >= 0 && j >= 0;i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1;i >= 0 && j < board.length;i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    // Recursive function
    static boolean nQueens(char board[][], int row) {

        // Base Case
        if (row == board.length) {
            printBoard(board);
            return true;
        }

        // Try every column
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {

                // Place Queen
                board[row][j] = 'Q';

                // Recursive Call
                if (nQueens(board, row + 1))
                    return true;

                // Backtracking
                board[row][j] = '.';
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int n = 4;

        char board[][] = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
    }
}