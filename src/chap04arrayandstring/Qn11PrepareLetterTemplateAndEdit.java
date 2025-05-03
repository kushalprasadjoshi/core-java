package chap04arrayandstring;

public class Qn11PrepareLetterTemplateAndEdit {
    public static void main(String[] args) {
        // Design a letter format
        String letter = "Dear <|receiver|>.\n" +
                "\tI got the letter written by you. It was nice." +
                "This letter is written as a reply to your letter.\n" +
                "Thanks for remembering!\n" +
                "Your friend\n<|sender|>";

        // Replace receiver with your friend's name
        letter = letter.replace("<|receiver|>", "Shailendra");

        // Replace sender with your name
        letter = letter.replace("<|sender|>", "Kushal");

        System.out.println(letter);
    }
}
