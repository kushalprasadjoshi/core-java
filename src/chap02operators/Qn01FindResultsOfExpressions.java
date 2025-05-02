package chap02operators;

public class Qn01FindResultsOfExpressions {
    public static void main(String[] args) {
        float a = 7/4*9/2; // Arithmetic calculation among integers is always integer
           /*
           = 7/4*9/2
           = 1*9/2;
           = 9/2
           = 4
            */
        System.out.println(a);

        float b = (float) (7/4*9/2); // Typecasting is done after the calculation is finished. So same result.
        System.out.println(b);

        float c = 7/4f*9/2; // We also have a floating number so float and int arithmetic is a float
           /*
           = 7/4*9/2
           = 1.75*9/2
           = 15.75/2
           = 7.875
            */
        System.out.println(c);
    }
}
