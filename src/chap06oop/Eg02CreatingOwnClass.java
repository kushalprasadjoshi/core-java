package chap06oop;

import java.util.Scanner;

class Student {
    byte roll;
    String name, address;

    public void printDetails() {
        System.out.println("The roll of student is " + roll);
        System.out.println("The name of student is " + name);
        System.out.println("The address of student is " + address);
    }
}

public class Eg02CreatingOwnClass {
    public static void main(String[] args) {
        Student student = new Student(); // Instantiating a new Student object

        // Setting attributes for student
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter roll, name and address of student.");
        student.roll = scan.nextByte();
        scan.nextLine(); // To consume the left over new line character
        student.name = scan.nextLine();
        student.address = scan.nextLine();

        // Printing details of student
        System.out.println("\nThe details of students are: ");
        student.printDetails();
    }
}
