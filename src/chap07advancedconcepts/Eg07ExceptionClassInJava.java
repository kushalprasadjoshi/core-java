package chap07advancedconcepts;

class MyExceptions extends Exception {
    @Override
    public String toString() {
        return "This is a exception from toString() method.";
    }

    @Override
    public String getMessage() {
        return "This is an exception from getMessage() method.";
    }
}

public class Eg07ExceptionClassInJava {
    public static void main(String[] args) {
        try {
            throw new MyExceptions();
        } catch (Exception e) {
            System.out.println(e);  // This is an exception from toString() method
            System.out.println(e.toString()); // This is an exception from toString() method
            System.out.println(e.getMessage()); // This is an exception from getMessage() method
        }
    }
}
