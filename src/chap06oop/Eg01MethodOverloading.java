package chap06oop;

public class Eg01MethodOverloading {
    static double sum(int a, int b) { return a + b; }
    static double sum(int a, int b, int c) { return a + b + c; }
    static double sum(float a, float b) { return a + b; }
    static double sum(float a, float b, float c) { return a + b + c; }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + sum(2, 3));
        System.out.println("2 + 3 + 4 = " + sum(2, 3, 4));
        System.out.println("2.5 + 3.6 = " + sum(2.5f, 3.6f));
        System.out.println("2.5 + 3.6 + 4.7 = " + sum(2.5f, 3.4f + 4.7f));
    }
}
