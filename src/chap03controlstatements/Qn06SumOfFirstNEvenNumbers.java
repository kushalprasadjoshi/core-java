package chap03controlstatements;

import java.util.Scanner;

public class Qn06SumOfFirstNEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the last number: ");
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
