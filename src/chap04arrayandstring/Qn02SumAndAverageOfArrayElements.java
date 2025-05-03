package chap04arrayandstring;

import java.util.Scanner;

public class Qn02SumAndAverageOfArrayElements {
    public static void main(String[] args) {
        // Declare and memory allocation of array
        int[] integer = new int[5];

        // Take input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 5 integers.");
        for (int i = 0; i < integer.length; i++) {
            integer[i] = scan.nextInt();
        }

        // Calculate sum and average
        int sum = 0;
        float average;
        for (int i = 0; i < integer.length; i++) {
            sum += integer[i];
        }

        average = (float)sum / integer.length;

        // Display sum and average
        System.out.println("The sum of numbers is " + sum);
        System.out.println("The average of numbers is " + average);
    }
}
