package chap07advancedconcepts;

import java.util.GregorianCalendar;

public class Eg25GregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2024));
    }
}