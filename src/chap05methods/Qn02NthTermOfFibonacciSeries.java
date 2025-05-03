package chap05methods;

public class Qn02NthTermOfFibonacciSeries {
    static int fibonacciNumber(int n) {
        if (n == 1){
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        /*
        if (n == 1 || n == 2) {
            return n - 1;
        }
         */
        else {
            return fibonacciNumber(n-1) + fibonacciNumber(n-2);
        }
    }

    public static void main(String[] args) {
        int num = fibonacciNumber(7);
        System.out.println("The fibonacci number at 7th position is " + num);
    }
}
