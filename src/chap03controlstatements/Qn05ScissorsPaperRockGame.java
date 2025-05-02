package chap03controlstatements;

import java.util.Random;
import java.util.Scanner;

public class Qn05ScissorsPaperRockGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter 0 for Scissors, 1 for Paper and 2 for Rock.");
            int userInput = scan.nextByte();

            Random random = new Random();
            int botInput = random.nextInt(3);

            if (userInput == botInput) {
                System.out.println("Draw!");
            } else if (userInput == 0 && botInput == 2 ||
                    userInput == 1 && botInput == 0 ||
                    userInput == 2 && botInput == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer win!");
            }
            System.out.println("Computer choice: " + botInput + "\n");

        } while (true);

    }
}
