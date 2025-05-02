package chap03controlstatements;

import java.util.Scanner;

public class Qn07_DisplayMultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter a number to find multiplication table of: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i < 10; i++)
            System.out.printf("%d x %d = %d\n", n, i, n * i);
    }
}
