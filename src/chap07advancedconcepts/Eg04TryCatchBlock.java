package chap07advancedconcepts;

public class Eg04TryCatchBlock {
    public static void main(String[] args) {
        int a = 78;
        int b = 0;
        // 78/0 is an Arithmetic Exception which gives error
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch (Exception e) {
            System.out.println("We failed to divide. Reason : ");
            System.out.println(e);
        }
        System.out.println("End of the program.");
    }
}
