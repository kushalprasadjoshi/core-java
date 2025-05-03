package chap06oop;

class MyStudent {
    int roll;
    String name;

    // Constructor with one parameter
    public MyStudent(int roll) {
        this.roll = roll;
    }

    // Constructor with two parameters
    public MyStudent(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Eg06ConstructorOverloading {
    public static void main(String[] args) {
        MyStudent student1 = new MyStudent(40); // Initialize roll of student to 45
        MyStudent student2 = new MyStudent(45, "Kushal"); // Initialize roll of student to 45 and name to Kushal

        // Print details initialized
        System.out.println("Roll of student1: " + student1.roll);
        System.out.println("Roll of student2: " + student2.roll);
        System.out.println("Name of student2: " + student2.name);
    }
}
