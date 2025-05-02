package chap03controlstatements;

import java.util.Scanner;

public class Qn08FindFactorial {
    public static void main(String[] args) {
        System.out.print("Enter a number to find factorial of: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factorial = 1L;

        while (n != 0) {
            factorial *= n;
            n --;
        }

        System.out.println("The factorial of given number is " + factorial);
    }
}

