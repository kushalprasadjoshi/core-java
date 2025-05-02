package chap01introduction;

public class Eg05PrintingMethods {
    public static void main(String[] args) {
        String name = "Kushal Prasad Joshi"; // String class has a special support in Java so can be used simply like data types

        System.out.print(name); // Prints name
        System.out.println(); // Prints a new line
        System.out.println(name); // Prints name and a new line
        System.out.printf("%s\n", name); // Prints name and a new line
        System.out.format("%s", name); // Prints name
    }
}