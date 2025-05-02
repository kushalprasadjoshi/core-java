package chap03controlstatements;

import java.util.Scanner;

public class Eg01CanVoteOrNot {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");

        Scanner scan = new Scanner(System.in);
        byte age = scan.nextByte();

        // Check condition for voting
        if (age >= 18) {
            System.out.println("You can vote.");
        }
        else {
            System.out.println("You cannot vote.");
        }
    }
}
