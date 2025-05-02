package chap03controlstatements;

import java.util.Scanner;

public class Qn03DayOfWeekAccordingToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the day according to number assuming Sunday as 1: ");
        byte day = scan.nextByte();

        // Use switch case to select day according to number
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Enter number between 1 and 7.");
        }
    }
}
