package chap03controlstatements;

public class Eg07OddNumbersFrom1To100 {
    public static void main(String[] args) {
        // Use for loop to print odd numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
