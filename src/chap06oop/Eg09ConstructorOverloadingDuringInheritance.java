package chap06oop;

class Base {
    Base(int y, int z) {
        System.out.println("The sum of x and y is " + (y + z));
    }
}

class Derived extends Base {
    Derived(int x, int y, int z) {
        super(y, z);
        System.out.println("The sum of x, y and z is " + (x + y + z));
    }
}

class DerivedFromDerived extends Derived {
    DerivedFromDerived(int w, int x, int y, int z) {
        super(x, y, z);
        System.out.println("The sum of w, x, y and z is " + (w + x + y + z));
    }
}

public class Eg09ConstructorOverloadingDuringInheritance {
    public static void main(String[] args) {
        // Instantiation of object of DerivedFromDerived class
        DerivedFromDerived object = new DerivedFromDerived(1, 2, 3, 4);
    }
}
