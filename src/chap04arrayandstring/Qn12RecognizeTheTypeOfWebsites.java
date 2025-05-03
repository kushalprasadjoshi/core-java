package chap04arrayandstring;

import java.util.Scanner;

public class Qn12RecognizeTheTypeOfWebsites {
    public static void main(String[] args) {
        System.out.print("Enter a website name: ");
        Scanner scan = new Scanner(System.in);
        String website = scan.next();

        if (website.endsWith(".com"))
            System.out.println("This is a commercial website.");
        else if (website.endsWith(".org"))
            System.out.println("This is a organizational website.");
        else if (website.endsWith(".edu"))
            System.out.println("This is a educational website.");
        else if (website.endsWith(".np"))
            System.out.println("This is a nepali website.");
        else
            System.out.println("I haven't heard about such website before.");
    }
}
