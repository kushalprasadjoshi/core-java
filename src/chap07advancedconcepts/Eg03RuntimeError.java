package chap07advancedconcepts;

import java.util.Scanner;

public class Eg03RuntimeError {
    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a divisor.");
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000 / k);
    }
}
// When user input 0 the program throws error ---> Runtime error
