package chap06oop;

import java.util.Random;
import java.util.Scanner;

class Game {
    int generatedNumber, inputNumber;

    // Constructor that generate random number
    public Game() {
        Random random = new Random();
        generatedNumber = random.nextInt(0, 100);
    }

    // Method for wining condition
    boolean win() {
        if (inputNumber == generatedNumber) {
            System.out.println("You guessed it right.");
            return true;
        } else if (inputNumber < generatedNumber) {
            System.out.println("You guessed lower. Try again.");
        } else {
            System.out.println("You guessed higher. Try again.");
        }
        return false;
    }
}

public class Qn02GuessTheNumberGame {
    public static void main(String[] args) {
        // Instantiation of a new Game object
        Game player = new Game();

        System.out.println("Guess the number between 0 and 100.");
        Scanner scan = new Scanner(System.in);
        player.inputNumber = scan.nextInt();

        while (! player.win()) {
            player.inputNumber = scan.nextInt();
        }
    }
}
