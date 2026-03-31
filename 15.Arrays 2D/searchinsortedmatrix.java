public class searchinsortedmatrix {

    public static boolean staircasesearch(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length-1;
        boolean ispresent=false;
        while (row <= matrix.length-1 && column >= 0) {

            if (matrix[row][column] == key) {
                System.out.println("Found key at (" + row + "," + column + ")");
                ispresent=true;
                break;
            }
            else if (key < matrix[row][column]) { // FIXED CONDITION
                column--;
            }
            else {
                row++;
            }
        }
         if (!ispresent) System.out.println("Element is not present in the array");
        return ispresent;
       
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;
        staircasesearch(matrix, key);
    }
}