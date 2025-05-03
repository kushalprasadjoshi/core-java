package chap04arrayandstring;

public class Eg02MultidimensionalArrays {
    public static void main(String[] args) {
        // Declare array
        int[][] matrix;
        // Memory allocation for array
        matrix = new int[2][3];

        // Initialize the array elements
        matrix[0][0] = 71;
        matrix[0][1] = 12;
        matrix[0][2] = 10;
        matrix[1][0] = 87;
        matrix[1][1] = 33;
        matrix[1][2] = 45;

        // Printing using for loop.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
