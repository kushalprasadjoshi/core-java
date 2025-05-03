package chap05methods;

import java.util.Scanner;

public class Qn11FindCombination {
    // Method to calculate factorial using recursion
    static long factorial (int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) return 1;
        else return n * factorial(n - 1); // Recursive case
    }

    // Method to calculate combination
    static int nCr(int n, int r) {
        // nCr = n! /(r! * (n-r)!)
        return (int) (factorial(n) / (factorial (r) * factorial(n-r)));
    }

    public static void main(String[] args) {
        // Input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values for n and r in nCr.");
        int n = scan.nextInt();
        int r = scan.nextInt();

        // Check n is greater than or equal to r and r is greater than or equal to 0
        if (n >= r && r >= 0) System.out.println("The combination is " + nCr(n, r));
        else System.out.println("Invalid input. Ensure n >= r and r >= 0");
    }
}
