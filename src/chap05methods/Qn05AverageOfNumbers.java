package chap05methods;

public class Qn05AverageOfNumbers {
    static float averageNumber(int ...arr) {
        int result = 0;
        for (int a :
                arr) {
            result += a;
        }
        return (float)result / arr.length;
    }

    public static void main(String[] args) {
        float a = averageNumber(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        float b = averageNumber(1, 2, 3, 4, 5, 6, 7);
        float c = averageNumber(1, 2, 3, 4, 5);
        float d = averageNumber(1, 2, 3);

        System.out.println("The average of first 10 natural numbers is " + a);
        System.out.println("The average of first 7 natural numbers is " + b);
        System.out.println("The average of first 5 natural numbers is " + c);
        System.out.println("The average of first 3 natural numbers is " + d);
    }
}
