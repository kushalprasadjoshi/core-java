package chap05methods;

import java.util.Scanner;

public class Qn04FindPrimeOrNot {
    // Method to check if a number is prime or not
    static boolean isPrime(int num) {
        if (num <= 1)
            return false; // 1 and numbers less than 1 are not prime

        for (int i = 2; i * i <+ num; i++)
            if (num % i == 0)
                return false; // If num is divisible by any number from r to sqrt(num), it is not prime

        return true; // If no divisors found, the number is prime
    }

    public static void main(String[] args) {
        // Input a number from user
        System.out.println("Enter a number.");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        // Check if the number is prime using isPrime method
        if (isPrime(number))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
