package chap06oop;

interface Greet {
    void greet(String name);
}

public class Eg19LambdaExpressions {
    public static void main(String[] args) {
        Greet greet = (name) -> {
            System.out.println("Hello, " + name);
        };

        // Use lambda expression
        greet.greet("Kushal");

        // Same lambda expression can be written in single line as:
        Greet greet1 = (name) -> System.out.println("Hello, " + name);
        greet1.greet("Kushal Prasad Joshi");
    }
}

