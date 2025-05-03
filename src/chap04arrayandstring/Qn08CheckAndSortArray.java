package chap04arrayandstring;

import java.util.Scanner;

public class Qn08CheckAndSortArray {
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

        // Check if the array is sorted or not
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Sort the array if not sorted
        if (isSorted) {
            System.out.println("Your array is sorted.");
        }
        else {
            System.out.println("Your array is not sorted.");
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        array[j] = array[j] + array[j + 1];
                        array[j + 1] = array[j] - array[j + 1];
                        array[j] = array[j] - array[j + 1];
                    }
                }
            }
            System.out.println("The array after sorting is: ");
            for (int element : array)
                System.out.print(element + "\t");
        }
    }
}
