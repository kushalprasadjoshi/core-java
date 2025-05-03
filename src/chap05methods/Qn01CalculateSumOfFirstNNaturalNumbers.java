package chap05methods;

public class Qn01CalculateSumOfFirstNNaturalNumbers {
    static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        int sum = sumOfNaturalNumbers(100);
        System.out.println("The sum of first 100 natural numbers is " + sum);
    }
}
