package chap06oop;

interface Shape {
    float getPerimeter();
    float getArea();
}

class Circle implements Shape{
    int radius;

    public float getPerimeter() {
        return 2 * 3.14f * radius;
    }

    public float getArea() {
        return 3.14f * radius * radius;
    }
}
public class Eg14IntroductionToInterface {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 7;
        System.out.println("The radius of circle is " + circle.radius);
        System.out.println("The perimeter of circle is " + circle.getPerimeter());
        System.out.println("The area of circle is " + circle.getArea());
    }
}
