/**
 * I hope this package may be helpful to you.
 * @author Kushal Prasad Joshi
 * @version 0.1.1.1
 * @since 2024
 */

package _15_CreatingDocumetation;

/**
 * This class is to demonstrate what javadoc is and how it is used in java industry
 * You can use html inside this like <i>italic</i><b>bold</b><p>New paragraph</p>
 * @author Kushal Prasad Joshi
 * @version 0.1.1.1
 * @since 2024
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/ap1/index.html" target=_blank>Java Docs</a>
 */
public class Eg14CreateOwnDocumentation {
    /**
     * This method can add two numbers.
     * @param a This is argument1 supplied.
     * @param b This is argument2 supplied.
     * @deprecated This is deprecated. Use <b>+</b> operator instead.
     */
    public void add(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }

    /**
     * This is a method to divide two numbers.
     * @param a This is first argument supplied to function.
     * @param b This is second argument supplied to function.
     * @return The quotient is returned.
     * @throws ArithmeticException if b = 0.
     */
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 0;
    }

    /**
     * This is my main method in class
     */
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}
