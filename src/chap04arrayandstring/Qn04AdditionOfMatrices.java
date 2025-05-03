package chap04arrayandstring;

import java.util.Scanner;

public class Qn04AdditionOfMatrices {
    public static void main(String[] args) {
        // Declaration and memory allocation of matrices
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        // Taking elements of matrix from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of first matrix.");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix.");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }

        // Calculate sum of matrix
        int[][] sum = new int[3][3];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display sum
        System.out.println("The sum of given matrix is: ");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.printf("%6d", sum[i][j]);
            }
            System.out.println();
        }
    }
}
