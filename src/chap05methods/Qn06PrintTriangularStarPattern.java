/*
This program will print the following pattern.
    *
    * *
    * * *
    * * * *
    * * * * *
 */

package chap05methods;

public class Qn06PrintTriangularStarPattern {
    static void starPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starPattern(5);
    }
}
