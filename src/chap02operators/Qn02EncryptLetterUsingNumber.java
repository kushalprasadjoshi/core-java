package chap02operators;

import java.util.Scanner;

public class Qn02EncryptLetterUsingNumber {
    public static void main(String[] args) {
        int number = 67;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character.");
        char character = scan.next().charAt(0);

        // Encrypt character using number
        character = (char) (character + number);
        System.out.println("Character encrypted successfully! to " + character);

        // Decrypt the character
        character = (char) (character - number);
        System.out.println("The character is " + character);
    }
}
