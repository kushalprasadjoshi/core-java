package chap05methods;

import java.util.Scanner;

public class Qn10ConvertDecimalNumberToBinary {
    // Method to convert decimal to binary
    static void decimalToBinary(int decimal) {
        if (decimal == 0) {
            System.out.println("Binary Equivalent: 0");
            return;
        }

        byte[] binary = new byte[32]; // Assuming 32-bit integer
        int i = 0;

        while (decimal > 0) {
            binary[i] = (byte) (decimal % 2);
            decimal /= 2;
            i++;
        }

        System.out.print("Binary equivalent: ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j]);
    }

    public static void main(String[] args) {
        // Input from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a decimal number.");
        int decimalNumber = scan.nextInt();

        // Convert and display binary equivalent
        decimalToBinary(decimalNumber);
    }
}
