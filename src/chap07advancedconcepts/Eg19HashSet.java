package chap07advancedconcepts;

import java.util.*;

public class Eg19HashSet {
    public static void main(String args[]) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        // Print HashSet
        System.out.println("HashSet: " + set);
    }
}
