package chap04arrayandstring;

import java.util.Scanner;

public class Qn07ReverseAnArray {
    public static void main(String[] args) {
        // Declaration and memory allocation of an array
        int[] array = new int[10];

        // Take array elements as input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integers.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        // Print the original array
        System.out.println("Your array is: ");
        for (int element : array)
            System.out.print(element + "\t");
        System.out.println();

        // Reverse the array
        for (int i = 0; i < Math.floorDiv(array.length, 2); i++) {
            // Swap array[i] and array[array.length -1 - i]
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }

        // Print array after reversing
        System.out.println("The array after reversing is: ");
        for (int element : array)
            System.out.print(element + "\t");
    }
}
