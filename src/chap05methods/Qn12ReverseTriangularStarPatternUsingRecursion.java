/*
This program will print the following pattern using recursion.
    * * * * *
    * * * *
    * * *
    * *
    *
 */

package chap05methods;

public class Qn12ReverseTriangularStarPatternUsingRecursion {
    static void printStar(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*  ");
            }
            System.out.println();
            printStar(n - 1);
        }
    }

    public static void main(String[] args) {
        printStar(5);
    }
}
