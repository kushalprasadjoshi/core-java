package chap05methods;

import java.util.Scanner;

public class Qn09FindHCFAndLCM {
    // Method to calculate HCF
    static int calculateHCF(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) num1 -= num2;
            else num2 -= num1;
        }
        return num1;
    }

    // Method to calculate LCM
    static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateHCF(num1, num2);
    }

    public static void main(String[] args) {
        // Take input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two numbers.");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        // Calculate and display the HCF and LCM
        System.out.println("The HCF of given numbers is " + calculateHCF(number1, number2));
        System.out.println("The LCM of given numbers is " + calculateLCM(number1, number2));
    }
}
