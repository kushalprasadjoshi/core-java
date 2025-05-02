package chap03controlstatements;

import java.util.Scanner;

public class Qn01StudentPassedOrFailed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        byte markInPhysics = scan.nextByte();
        System.out.print("Enter marks in Chemistry: ");
        byte markInChemistry = scan.nextByte();
        System.out.print("Enter marks in Mathematics: ");
        byte markInMathematics = scan.nextByte();

        // Calculate average of marks
        float average = (markInPhysics + markInChemistry + markInMathematics) / 3.0f ;

        // Check if the student pass or fail
        if (markInPhysics >= 33 && markInChemistry >= 33 && markInMathematics >= 33 && average >= 40)
            System.out.println("Congratulations! You passed the exam.");
        else
            System.out.println("Work hard! You failed in the exam.");
    }
}
