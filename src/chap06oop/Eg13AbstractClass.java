package chap06oop;

abstract class Shapes {
    int dimension;

    abstract int getArea();
}

class Square extends Shapes {
    @Override
    int getArea() {
        return dimension * dimension;
    }
}

public class Eg13AbstractClass {
    public static void main(String[] args) {
        Square square = new Square();
        square.dimension = 5;
        System.out.println("The area of square is " + square.getArea());

//        Shapes shapes = new Shape(); // Not allowed

        Shapes shape = new Square(); // Allowed
        shape.dimension = 23; // Allowed
        System.out.println("The area of shape is " + shape.getArea());  // Allowed
    }
}
