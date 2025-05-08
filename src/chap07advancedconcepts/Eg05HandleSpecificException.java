package chap07advancedconcepts;

import java.util.Scanner;

public class Eg05HandleSpecificException {
    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index for value: ");
        int index = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int number = sc.nextInt();

        // Handle Specific Exception that can occur
        try {
            System.out.println("The value at array index entered is : " + array[index]);
            System.out.println("The value after dividing is : " + (float) (array[index] / number));
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some exception occurred!");
            System.out.println(e);
        }
    }
}
