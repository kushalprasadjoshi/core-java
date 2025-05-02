package chap01introduction;

import java.util.Scanner;

public class Qn03CalculatePercentage {
    public static void main(String[] args) {

        System.out.println("Enter the marks obtained by students in seven subjects (out of 100).");

        Scanner scan = new Scanner(System.in);
        float marks1 = scan.nextFloat();
        float marks2 = scan.nextFloat();
        float marks3 = scan.nextFloat();
        float marks4 = scan.nextFloat();
        float marks5 = scan.nextFloat();
        float marks6 = scan.nextFloat();
        float marks7 = scan.nextFloat();

        float sumOfMarks = marks1 + marks2 + marks3 + marks4 + marks5 + marks6 + marks7;
        float percentage = sumOfMarks / 7; // Calculate percentage

        System.out.println("The percentage obtained by student is " + percentage);
    }
}
