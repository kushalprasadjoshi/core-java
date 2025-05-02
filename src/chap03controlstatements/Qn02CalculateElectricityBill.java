/*
Electricity board charges are according to the following rules:
    For first 100 units  Rs.100 (minimum charge)
    For next 50 units  Rs.8.5 per unit
    For next 100 units  Rs. 9.5 per unit
    For beyond 250 units  Rs.10.5 per unit
    Additional charges  13% tax and Rs.100 for maintenance
 */

package chap03controlstatements;

import java.util.Scanner;

public class Qn02CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float charges;

        System.out.print("Enter the total units consumed: ");
        float unitsConsumed = scan.nextFloat();

        if (unitsConsumed <= 100)
            charges = 100;
        else if (unitsConsumed <= 150)
            charges = 100 + (unitsConsumed - 100) * 8.5f;
        else if (unitsConsumed <= 250)
            charges = 100 + 50 * 8.5f + (unitsConsumed - 150) * 9.5f;
        else
            charges = 100 + 50 * 8.5f + 100 * 9.5f + (unitsConsumed - 250) * 10.5f;

        float chargeToPay = charges + (13.0f / 100) * charges + 100;

        System.out.println("Total charges = " + chargeToPay);
    }
}
