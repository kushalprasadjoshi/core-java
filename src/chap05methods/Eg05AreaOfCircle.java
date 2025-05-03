package chap05methods;

public class Eg05AreaOfCircle {
    // Method to find the area of circle
    static double areaOfCircle(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        System.out.println("The are of circle with radius 3 is " +
                areaOfCircle(3));
    }
}
