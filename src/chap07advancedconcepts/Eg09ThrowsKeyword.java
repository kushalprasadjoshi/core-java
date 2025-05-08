package chap07advancedconcepts;

public class Eg09ThrowsKeyword {

        public static void main(String[] args) {
            try {
                methodThatThrowsException();
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        static void methodThatThrowsException() throws Exception {
            throw new Exception("This is an exception");
        }
}
