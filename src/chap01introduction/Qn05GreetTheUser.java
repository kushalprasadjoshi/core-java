package chap01introduction;

import java.util.Scanner;

public class Qn05GreetTheUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.next(); // String class has special support in Java

        System.out.println("Hello " + name + ", have a good day!");
    }
}
