public class SudokuSolver {

    // ----------------------------------------------------------
    // Function to check whether a digit can be placed safely
    // ----------------------------------------------------------
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        // ===== Check the column =====
        // Go through every row in the current column
        // If the digit already exists, we cannot place it.
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;   // Digit already present in column
            }
        }

        // ===== Check the row =====
        // Go through every column in the current row
        // If the digit already exists, we cannot place it.
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;   // Digit already present in row
            }
        }

        // ===== Check the 3×3 Grid =====
        // Find the starting row of the current grid.
        // Example:
        // row = 5
        // row/3 = 1
        // 1*3 = 3
        // So the grid starts from row 3.

        int sr = (row / 3) * 3;

        // Find the starting column of the current grid.
        int sc = (col / 3) * 3;

        // Check all 9 cells inside that 3×3 grid
        for (int i = sr; i < sr + 3; i++) {

            for (int j = sc; j < sc + 3; j++) {

                if (sudoku[i][j] == digit) {
                    return false; // Digit already exists in grid
                }
            }
        }

        // If digit is not found anywhere,
        // it is safe to place.
        return true;
    }

    // ----------------------------------------------------------
    // Main Sudoku Solver Function
    // ----------------------------------------------------------
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {

        // ===== Base Case =====
        // If row becomes 9,
        // it means we have crossed the last row.
        // Entire Sudoku is solved.

        if (row == 9) {
            return true;
        }

        // -------------------------------------------------
        // Find the next cell
        // -------------------------------------------------

        int nextRow = row;
        int nextCol = col + 1;

        // Suppose current cell is the last column.

        // Example

        // row = 2
        // col = 8

        // Next cell should become

        // row = 3
        // col = 0

        if (col + 1 == 9) {

            nextRow = row + 1;

            nextCol = 0;
        }

        // -------------------------------------------------
        // If current cell already contains a number
        // -------------------------------------------------

        // Example

        // 5 3 .
        // ↑

        // This 5 is already given by the puzzle.

        // We should NOT change it.

        // So simply move to the next cell.

        if (sudoku[row][col] != 0) {

            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // -------------------------------------------------
        // Current cell is empty.
        // Try every digit from 1 to 9.
        // -------------------------------------------------

        for (int digit = 1; digit <= 9; digit++) {

            // Check whether current digit is safe

            if (isSafe(sudoku, row, col, digit)) {

                // Put the digit inside the empty cell

                sudoku[row][col] = digit;

                // Solve the remaining Sudoku

                if (sudokuSolver(sudoku, nextRow, nextCol)) {

                    // If solved,
                    // no need to try other digits.

                    return true;
                }

                // -----------------------------------------
                // Backtracking
                // -----------------------------------------

                // Suppose digit 5 looked correct.

                // But later we found
                // it creates a problem.

                // So erase it again.

                sudoku[row][col] = 0;
            }
        }

        // None of the digits worked.

        return false;
    }

    // ----------------------------------------------------------
    // Print Sudoku
    // ----------------------------------------------------------

    public static void printSudoku(int sudoku[][]) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                System.out.print(sudoku[i][j] + " ");
            }

            System.out.println();
        }
    }

    // ----------------------------------------------------------
    // Main Function
    // ----------------------------------------------------------

    public static void main(String args[]) {

        // 0 means empty cell

        int sudoku[][] = {

            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        // Start solving from first cell (0,0)

        if (sudokuSolver(sudoku, 0, 0)) {

            System.out.println("Solved Sudoku:");

            printSudoku(sudoku);

        } else {

            System.out.println("Solution doesn't exist");
        }
    }
}