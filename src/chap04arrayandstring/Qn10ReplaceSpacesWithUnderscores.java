package chap04arrayandstring;

import java.util.Scanner;

public class Qn10ReplaceSpacesWithUnderscores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read String from user
        System.out.println("Enter a string with white spaces:");
        String string = scan.nextLine();

        // Replace white spaces with underscores.
        string = string.replace(' ', '_');
        System.out.println(string);
    }
}
