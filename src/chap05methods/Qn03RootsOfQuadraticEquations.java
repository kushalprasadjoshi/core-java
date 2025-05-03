package chap05methods;

import java.util.Scanner;

import static java.lang.Math.sqrt;
import  static java.lang.Math.abs;

public class Qn03RootsOfQuadraticEquations {
    // Method to calculate roots of quadratic equations
    static void rootsOfQuardatic(float a, float b, float c) {
        float discriminant = b * b - 4 * a * c;

        // Check nature of roots
        if (discriminant > 0) {
            float root1 = (float) ((-b + sqrt(discriminant)) / (2 * a));
            float root2 = (float) ((-b - sqrt(discriminant)) / (2 * a));
            System.out.println("Roots are real and distinct.");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        } else if (discriminant == 0) {
            float root = (float) (-b / (2 * a));
            System.out.println("Roots are real and equal.");
            System.out.println("Roots = " + root);
        }
        else {
            float realPart = (float) (-b / (2 * a));
            float imaginaryPart = (float) (sqrt(abs(discriminant))/ (2 * a));
            System.out.println("Roots are complex and conjugate of each other.");
            System.out.printf("Root1 = %f + %f i\n", realPart , imaginaryPart);
            System.out.printf("Root2 = %f - %f i\n", realPart , imaginaryPart);
        }
    }

    public static void main(String[] args) {
        // Input coefficients from the user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter coefficients of quardatic equation (a, b, c).");
        float a = scan.nextInt();
        float b = scan.nextInt();
        float c = scan.nextInt();

        // Call the method to find roots
        rootsOfQuardatic(a, b, c);
    }
}
