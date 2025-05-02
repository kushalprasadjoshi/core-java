package chap02operators;

public class Eg03TypePromotionRule {
    public static void main(String[] args) {
        char character= 'A';
        int integer = 5;
        float floatingNumber = 6.0f;
        byte byteNumber = 34;
        short shortNumber = 234;
        long longNumber = 4L;
        double doubleNumber = 789.78D;

        System.out.println(byteNumber + shortNumber); // Prints int
        System.out.println(shortNumber + integer); // Prints int
        System.out.println(longNumber + floatingNumber); // Prints float
        System.out.println(integer + floatingNumber); // Prints float
        System.out.println(character + integer); // Prints int
        System.out.println(character + shortNumber); // Prints int
        System.out.println(longNumber + doubleNumber); // Prints double
        System.out.println(floatingNumber + doubleNumber); // Prints double
    }
}
