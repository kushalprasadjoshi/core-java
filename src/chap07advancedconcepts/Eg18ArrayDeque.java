package chap07advancedconcepts;

import java.util.*;

public class Eg18ArrayDeque {
    public static void main(String[] args) {
        // Create a ArrayDeque
        ArrayDeque<String> fruits = new ArrayDeque<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the LinkedList
        System.out.println("ArrayDeque: " + fruits);
    }
}
