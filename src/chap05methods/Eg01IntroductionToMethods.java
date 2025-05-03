package chap05methods;

public class Eg01IntroductionToMethods {
    // Declare a method
    static int sum(int number1, int number2) {
        int sum;
        sum = number1 + number2;
        return sum;
    }

     public static void main(String[] args) {
        System.out.println("Introduction to methods.");

        int num1 = 5, num2 = 6;

        // Call function inside same class
         int mySum = sum(num1, num2);

         System.out.println("The sum of numbers is " + mySum);
    }
}
