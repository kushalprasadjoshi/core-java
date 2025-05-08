package chap07advancedconcepts;

import java.util.ArrayList; // Import a variable size collection
import java.util.HashSet;
import java.util.Set;   // Import distinct collection
import java.util.TreeSet;   // Import TreeSet

public class Eg15AvailabilityOfCollections {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        TreeSet<Float> treeSet = new TreeSet<>();

        System.out.println("Collections are available as Classes and Interfaces.");
    }
}
