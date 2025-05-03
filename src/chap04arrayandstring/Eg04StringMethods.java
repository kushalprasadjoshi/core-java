package chap04arrayandstring;

public class Eg04StringMethods {
    public static void main(String[] args) {
        String name = "Kushal Prasad Joshi";

        // Finding length of String.
        System.out.println(name.length());

        // Converting String to Lower case.
        System.out.println(name.toLowerCase());

        // Converting String to Upper case.
        System.out.println(name.toUpperCase());

        // Removing all the leading and trading spaces from String.
        System.out.println(name.trim());

        // Returning a substring.
        // 1. Returning a string from the index to end.
        System.out.println(name.substring(5));
        // 2. Returning a string from index to index.
        System.out.println(name.substring(5,15));
        /*
        NOTE:
        1. The index starts from 0.
        2. The start index is included and end index is excluded.
         */

        // Replacing characters and strings in given string.
        System.out.println(name.replace("Kushal", "Kushal bro"));
        /*
        NOTE: Characters can also be used in the place of strings.
         */

        // Checking whether the String starts with the string or character.
        System.out.println(name.startsWith("Kush"));

        // Checking whether the String ends with the string or character.
        System.out.println(name.endsWith("Joshi"));

        //  Finding character at given index position.
        System.out.println(name.charAt(5));

        // Finding index of given String.
        System.out.println(name.indexOf("al"));

        // Finding the index of given string after the given index.
        System.out.println(name.indexOf('s', 6));

        // Finding the last index of given string or character.
        System.out.println(name.lastIndexOf('a'));

        // Finding the last index of given string or character before the index given.
        System.out.println(name.lastIndexOf('a', 10));

        // Checking equality of Strings.
        System.out.println(name.equals("kushal prasad joshi"));

        // Checking equality of string ignoring the case of characters.
        System.out.println(name.equalsIgnoreCase("kushal prasad joshi"));

    }
}
