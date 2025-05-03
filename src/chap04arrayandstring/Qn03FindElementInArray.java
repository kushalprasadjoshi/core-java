package chap04arrayandstring;

import java.util.Scanner;

public class Qn03FindElementInArray {
    public static void main(String[] args) {
        // Declaration and memory allocation of array
        int[] array = new int[10];

        // Taking input for elements of array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integers.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        // Taking input for the integer to search
        System.out.println("Enter element to search in the array.");
        int elementToSearch = scan.nextInt();

        // Searching the element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                System.out.println("The integer is found in index " + i);
                break;
            }
            if ( i == array.length - 1)
                System.out.println("The integer is not found in array.");
        }
    }
}
