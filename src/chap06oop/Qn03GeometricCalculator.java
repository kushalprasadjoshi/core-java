package chap06oop;

import java.util.Scanner;

interface MyShape {
    double area();
    double perimeter();
}

class MyCircle implements MyShape {
    double r;
    MyCircle(double r) { this.r = r; }
    public double area()      { return Math.PI * r * r; }
    public double perimeter() { return 2 * Math.PI * r; }
}

class MyRectangle implements MyShape {
    double w, h;
    MyRectangle(double w, double h) { this.w = w; this.h = h; }
    public double area()      { return w * h; }
    public double perimeter() { return 2 * (w + h); }
}

class MyTriangle implements MyShape {
    double a, b, c;
    MyTriangle(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }
    public double perimeter() {
        return a + b + c;
    }
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Qn03GeometricCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1) Circle  2) Rectangle  3) Triangle\nChoose shape: ");
        int choice = in.nextInt();

        MyShape shape;
        switch (choice) {
            case 1 -> {
                System.out.print("Radius: ");
                shape = new MyCircle(in.nextDouble());
            }
            case 2 -> {
                System.out.print("Width and height: ");
                shape = new MyRectangle(in.nextDouble(), in.nextDouble());
            }
            case 3 -> {
                System.out.print("Sides a, b, c: ");
                shape = new MyTriangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
            }
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        System.out.printf("Area: %.2f  Perimeter: %.2f%n",
                shape.area(), shape.perimeter());
    }
}
