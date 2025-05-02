package chap03controlstatements;

import java.util.Scanner;

public class Eg04EnhancedSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your operation.");
        double operand1 = scan.nextDouble();
        char operator = scan.next().charAt(0);
        double operand2 = scan.nextDouble();

        // Use switch case to switch operation
        switch (operator) {
            case '+' -> System.out.println("Your result is " + (operand1 + operand2));
            case '-' -> System.out.println("Your result is " + (operand1 - operand2));
            case '*' -> System.out.println("Your result is " + (operand1 * operand2));
            case '/' -> System.out.println("Your result is " + (operand1 / operand2));
            default -> System.out.println("Your input is wrong!");
        }
    }
}
