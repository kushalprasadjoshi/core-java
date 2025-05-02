package chap03controlstatements;

public class Eg08IterateAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Use for-each loop to print the elements in arr
        for (int element: arr) {
            System.out.println(element);
        }
    }
}
