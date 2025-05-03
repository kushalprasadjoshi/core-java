package chap06oop;

class Parent {
    Parent() {
        System.out.println("I'm constructor of Parent class.");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("I am constructor of Child class.");
    }
}

class GrandChild extends Child {
    GrandChild() {
        System.out.println("I'm constructor of GrandChild class.");
    }
}

public class Eg08ConstructorInInheritance {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
    }
}
