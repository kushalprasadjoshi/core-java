package chap02operators;

public class Eg06BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(2 & 3); // Bitwise and
            /*
            2 -----> 10
            3 -----> 11
            .............
            2 -----> 10
             */
        System.out.println(2 | 3); //Bitwise or
            /*
            2 -----> 10
            3 -----> 11
            .............
            3 -----> 11
             */
    }
}
