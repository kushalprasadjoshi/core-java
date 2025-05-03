package chap05methods;

public class Eg02MethodCallByObject {
    // Declare a method
     int sum(int number1, int number2) {
        int sum;
        sum = number1 + number2;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 5, num2 = 6;

        // Process of method call
        Eg02MethodCallByObject object = new Eg02MethodCallByObject(); // Object creation
        int mySum = object.sum(num1, num2); // Method call upon an object

        System.out.println("The sum of numbers is " + mySum);
    }
}
