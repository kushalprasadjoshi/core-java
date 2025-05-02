package chap03controlstatements;

import java.util.Scanner;

public class Qn04FindLeapYearOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = scan.nextInt();

        // Checking if the year is leap year or not
        if (year % 400 == 0)
            System.out.println("The year is leap year.");
        else if (year % 100 == 0)
            System.out.println("The year is not a leap year.");
        else if (year % 4 == 0)
            System.out.println("The year is leap year.");
        else
            System.out.println("The year is not leap year.");
    }
}
