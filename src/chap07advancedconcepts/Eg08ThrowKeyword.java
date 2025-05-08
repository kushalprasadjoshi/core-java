package chap07advancedconcepts;

public class Eg08ThrowKeyword {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
