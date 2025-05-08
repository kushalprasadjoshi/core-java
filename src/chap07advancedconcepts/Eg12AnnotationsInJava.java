package chap07advancedconcepts;

@FunctionalInterface
interface MyFunctionalInterface {
    void method();
//    void secondMethod();
}

class Parent {
    public void greet() {
        System.out.println("Good Morning!");
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Afternoon!");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Eg12AnnotationsInJava {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
        System.out.println(child.sum(6, 7));
    }
}
