package chap05methods;

public class Eg07VariableArguments {
    static int sum(int ...arr) {
        // Available as int[] arr.
        int result = 0;
        for (int integer :
                arr) {
            result += integer;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is " + sum(4, 5));
        System.out.println("The sum of 4, 5 and 6 is " + sum(4, 5, 6));
        System.out.println("The sum of 4, 5, 6 and 7 is " + sum(4, 5, 6, 7));
        System.out.println("The sum of 4, 5, 6, 7 and 8 is " + sum(4, 5, 6, 7, 8));
    }
}
/*
If you want to make 1 argument compulsory, you can write:
    static int sum(int a, int ...arr) {
        // code
    }
*/
