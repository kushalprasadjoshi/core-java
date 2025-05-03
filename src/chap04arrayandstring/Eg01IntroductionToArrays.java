package chap04arrayandstring;

import java.util.Scanner;

public class Eg01IntroductionToArrays {
    public static void main(String[] args) {
        int[] marks;
        marks = new int[7];

        // Take marks as input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks of student in 7 subjects.");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }

        // Display data using for-each loop
        System.out.println("The marks of student are: ");
        for (int element : marks)
            System.out.println(element);
    }
}
