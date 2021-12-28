public class matrixMultiplication {
    public static void main(String args[]) {
        // creating two matrices
        int a[][] = { { 3, 5, 9, 3 }, { 7, 2, 8, 5 }, { 1, 4, 6, 7 } };
        int b[][] = { { 9, 7 }, { 5, 1 }, { 2, 6 }, { 3, 4 } };
        int row1, col1, row2, col2;

        // Getting the number of columns & rows from the matrices
        row1 = a.length;
        col1 = a[0].length;
        row2 = b.length;
        col2 = b[0].length;

        // checking if multiplication possible
        if (col1 == row2) {
            // creating another matrix to store the multiplication of two matrices
            int c[][] = new int[row1][col2];
            // multiplying and printing multiplication of 2 matrices
            for (int i = 0 ; i < row1; i++) {
                for (int j = 0; j < col2 ; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < col1 ; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + "\t");
                }
                System.out.print("\n");
            }
        }
        else {
            System.out.println("Multiplication not possible");
        }
    }
}
