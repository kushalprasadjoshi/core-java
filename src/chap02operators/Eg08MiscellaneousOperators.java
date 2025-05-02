package chap02operators;

import java.util.Scanner;

public class Eg08MiscellaneousOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating an object of Scanner class

        System.out.println("Enter a character.");
        char character = scan.next().charAt(0);
        System.out.println((int) character); // Prints an integer
    }
}
