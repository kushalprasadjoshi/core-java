package chap01introduction;

import java.util.Scanner;

public class Eg04ReadingDataFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Taking input from user.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number.");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number.");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of numbers is " + sum );
    }
}
