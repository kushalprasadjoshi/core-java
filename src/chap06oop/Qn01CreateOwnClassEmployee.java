package chap06oop;

import java.util.Scanner;

class MyEmployee {
    int id;
    float salary;
    String name, address;

    public void printDetails() {
        System.out.println("The id of employee is " + id);
        System.out.println("The name of employee is " + name);
        System.out.println("The address of employee is " + address);
        System.out.println("The salary of employee is " + salary);
    }
}
public class Qn01CreateOwnClassEmployee {
    public static void main(String[] args) {
        MyEmployee myEmployee = new MyEmployee(); // Instantiating a new Employee object

        // Set attributes for employee
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id, name , address and salary of employee.");
        myEmployee.id = scan.nextInt();
        scan.nextLine(); // To consume the left over new line character
        myEmployee.name = scan.nextLine();
        myEmployee.address = scan.nextLine();
        myEmployee.salary = scan.nextFloat();

        // Print details of employee
        System.out.println("The details of employee is as follows: ");
        myEmployee.printDetails();
    }
}
