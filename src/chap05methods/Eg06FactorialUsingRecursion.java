package chap05methods;

import java.util.Scanner;

public class Eg06FactorialUsingRecursion {
    static long findFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find factorial.");
        int number = scan.nextInt();
        System.out.println("The factorial of given number is: " + findFactorial(number));
    }
}
