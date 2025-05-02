package chap03controlstatements;

public class Eg06EvenNumbersFrom1To100 {
    public static void main(String[] args) {
        int i = 1;

        // Use do while loop to print the even numbers
        do {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }while (i <= 100);
    }
}
