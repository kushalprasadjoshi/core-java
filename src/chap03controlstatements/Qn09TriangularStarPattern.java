/*
Write a program to print the following star pattern.
    *
    *	*
    *	*	*
    *	*	*	*
    *	*	*	*	*

 */

package chap03controlstatements;

public class Qn09TriangularStarPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*     ");
            System.out.println();
        }
    }
}
