package _09_OOPs;

class Rectangle {
    int length, breadth;

    int getArea() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle {
    int height;

    int getVolume() {
        return length * breadth * height;
    }
}

public class Eg07IntroductionToInheritance {
    public static void main(String[] args) {
        // Finding area of a Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.length = 45;
        rectangle.breadth = 34;
        System.out.println("The area of rectangle is " + rectangle.getArea());

        // Finding volume of Cuboid
        Cuboid cuboid = new Cuboid();
        cuboid.length = 23;     // Inherited from class Rectangle
        cuboid.breadth = 12;    // Inherited from class Rectangle
        cuboid.height = 32;
        System.out.println("The volume of cuboid is " + cuboid.getVolume());
    }
}
