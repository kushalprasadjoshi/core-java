package chap06oop;

interface TestInterface {
    // Abstract method
    public void square(int a);

    // Default method
    default void show() {
        System.out.println("Default Method Executed");
    }
}

class TestClass implements TestInterface {
    public void square(int a) {
        System.out.println("The square of a is " + (a * a));
    }
}

public class Eg16DefaultMethodsInInterfaces {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.square(5);
        test.show();
    }
}
