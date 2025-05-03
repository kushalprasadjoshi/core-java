package _07_Arrays.Exercise;

import java.util.Scanner;

public class Qn05MultiplicationOfMatrices {
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

        // Calculate product of matrix
        int[][] product = new int[3][3];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                for (int k = 0; k < product[i].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display product
        System.out.println("The product of given matrix is: ");
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[i].length; j++) {
                System.out.printf("%6d", product[i][j]);
            }
            System.out.println();
        }
    }
}


