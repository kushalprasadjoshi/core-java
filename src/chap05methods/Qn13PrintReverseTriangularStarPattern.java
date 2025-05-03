/*
This program will print the following pattern.
* * * * *
* * * *
* * *
* *
*
*/

package chap05methods;

public class Qn13PrintReverseTriangularStarPattern {
    static void starPattern(int n) {
        for (int i = n; i != 0; i--) {
            for (int j = i; j != 0; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starPattern(5);
    }
}
