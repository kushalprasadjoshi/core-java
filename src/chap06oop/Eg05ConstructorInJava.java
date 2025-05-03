package chap06oop;

class Students {
    int roll;
    String name;

    // Constructor with two parameters: roll and name
    public Students(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Eg05ConstructorInJava {
    public static void main(String[] args) {
        Students student = new Students(45, "Kushal");

        System.out.println("Roll of student is " + student.roll);
        System.out.println("Name of student is " + student.name);
    }
}
