package chap04arrayandstring;

import java.util.Scanner;

public class Qn06LargestAndSmallestElementInArray {
    public static void main(String[] args) {
        // Declaration and memory allocation of an array
        int[] array = new int[10];

        // Take array elements as input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integers.");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        // Find largest element in array
        int largest = Integer.MIN_VALUE;
        for (int element : array)
            if (element > largest)
                largest = element;

        // Find the smallest element in array
        int smallest = Integer.MAX_VALUE;
        for (int element : array)
            if (element < smallest)
                smallest = element;

        // Print smallest and largest values
        System.out.println("Largest value in array is " + largest);
        System.out.println("Smallest value in array is " + smallest);
    }
}
