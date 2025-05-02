package chap01introduction;

import java.util.Scanner;

public class Qn02CheckDataTypeOfInput {
    public static void main(String[] args) {
        System.out.println("Enter an integer.");

        Scanner scanner = new Scanner(System.in);
        boolean answer = scanner.hasNextInt();

        System.out.println("You entered " + answer);
    }
}
