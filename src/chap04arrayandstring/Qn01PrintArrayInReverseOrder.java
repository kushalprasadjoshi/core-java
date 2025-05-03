package chap04arrayandstring;

import java.util.Scanner;

public class Qn01PrintArrayInReverseOrder {
    public static void main(String[] args) {
        // Declaration and memory allocation of an array
        String[] friends = new String[5];

        // Take name of friends as input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter names of five friends.");
        for (int i = 0; i < friends.length; i++) {
            friends[i] = scan.nextLine();
        }

        // Display name of friends in reverse order
        for (int i = friends.length - 1; i >= 0; i--)
            System.out.println(friends[i]);
    }
}
