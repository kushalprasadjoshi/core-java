package chap07advancedconcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Eg11FileHandling {
    public static void main(String[] args) {

        // Code to create a new file
        File myFile = new File(".\\kushal.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Unable to create your file.");
            throw new RuntimeException(e);
        }

        // Code to write to a file.
        try {
            FileWriter myFileWriter = new FileWriter(".\\kushal.txt");
            myFileWriter.write("This is our first file from this java course.\n Ok now bye!");
            myFileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Unable to write to your file.");
            throw new RuntimeException(e);
        }

        // Reading a file
        try {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Unable to read from the file.");
            throw new RuntimeException(e);
        }

        // Deleting a file
        if (myFile.delete()) {
            System.out.println("I have deleted " + myFile.getName());
        }
        else {
            System.out.println("Unable to delete the file.");
        }
    }
}
