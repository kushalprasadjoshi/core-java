package chap05methods;

import java.util.Scanner;

public class Qn08FindPalindromeOrNot {
    // Method to check if a number is palindrome or not
    static boolean isPalindrome(int num) {
        // No negative number is palindrome
        if (num < 0) return false;

        int originalNum = num, reversedNum = 0, remainder;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        // Input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = scan.nextInt();

        // Check if the number is palindrome or not
        if (isPalindrome(number)) System.out.println(number + " is palindrome.");
        else System.out.println(number + " is not palindrome.");
    }
}
