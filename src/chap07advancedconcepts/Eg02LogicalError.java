package chap07advancedconcepts;

public class Eg02LogicalError {
    public static void main(String[] args) {
        // Write a program to print all prime numbers less than 10.
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }
    }
}
// Output: 2 3 5 7 9 ---> Logical Error because 9 is not prime
// This is a logic of printing odd numbers.
