package chap03controlstatements;

import java.util.Scanner;

public class Eg02DivisionsOfStudentsBasedOnPercentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the percentage of student: ");
        float percentage = scan.nextFloat();

        // Give divisions according to percentage
        if (percentage > 80)
            System.out.println("Distinction");
        else if (percentage > 70)
            System.out.println("First Division");
        else if (percentage > 60)
            System.out.println("Second division");
        else if (percentage > 50)
            System.out.println("Third division");
        else if (percentage > 40)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
