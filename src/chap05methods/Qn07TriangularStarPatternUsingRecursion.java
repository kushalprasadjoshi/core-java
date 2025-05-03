/*
This program will print the following pattern using recursion.
    *
    * *
    * * *
    * * * *
    * * * * *
 */

package chap05methods;

public class Qn07TriangularStarPatternUsingRecursion {
    static void printStar(int n) {
        if (n > 0) {
            printStar(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printStar(5);
    }
}

/*
---> printingStars(3)
---> printingStars(2) + 3 times * and new line
---> printingStars(1) + 2 times * and new line + 3 times * and new line
---> printingStars(0) + 1 time * and new line + 2 times * and new line + 3 times * and new line
 */
