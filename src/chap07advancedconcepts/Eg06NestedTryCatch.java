package chap07advancedconcepts;

import java.util.Scanner;

public class Eg06NestedTryCatch {
    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of array index: ");
            int index = sc.nextInt();
            System.out.println("The value at index is " + array[index]);

            try {
                System.out.print("Enter a divisor: ");
                int divisor = sc.nextInt();
                System.out.println("The number after dividing is " + (float) (array[index] / divisor));
            } catch (ArithmeticException e) {
                System.out.print("Cannot divide the number. Reason: ");
                System.out.println(e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Cannot find the array index. Reason: ");
            System.out.println(e);
        }
    }
}
