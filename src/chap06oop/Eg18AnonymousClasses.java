package chap06oop;

interface Greeting {
    void greet(String name);
}

public class Eg18AnonymousClasses {
    public static void main(String[] args) {
        // Create an anonymous class that implements the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello, " + name);
            }
        };

        // Use the anonymous class
        greeting.greet("John");
    }
}
