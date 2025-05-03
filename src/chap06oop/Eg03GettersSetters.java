package chap06oop;

import java.util.Scanner;

class Employee {
    private int id;
    private float salary;
    private String name, address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

/*
'this' keyword is optional if the variable names are different but compulsory if variable names are same.
For example:
1. this is compulsory in name = name i.e. this.name = name;
2. this is not compulsory in name = n i.e. name = n also works.
*/

public class Eg03GettersSetters {
    public static void main(String[] args) {
        Employee employee = new Employee();

        /*
        employee.id = 56;
        employee.name = "Kushal Prasad Joshi";
        employee.address = "Nepal";
        employee.salary = 100000;
        // This will throw error due to private access modifiers.
        // Also, you cannot access their values.
        System.out.println(employee.id); // also throws an error
         */

        // So we use getters and setters to access private variables.
        employee.setId(45);
        employee.setName("Kushal Prasad Joshi");
        employee.setAddress("Nepal");
        // Lets take salary as an input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter salary of " + employee.getName());
        employee.setSalary(scan.nextFloat());

        // Print the details of employee
        System.out.println("Employee id: " + employee.getId());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee address: " + employee.getAddress());
        System.out.println("Employee salary: " + employee.getSalary());
    }
}
