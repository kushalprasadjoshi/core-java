package chap07advancedconcepts;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Eg28DateTimeFormatterClass {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // Actual date
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd|MM|yyyy|E|h|m|a");  // Format
        String myDate = dtf.format(dt); // Creating date using Date and Format
        System.out.println(myDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;  // Format
        String myDate2 = dtf2.format(dt); // Creating date using Date and Format
    }

}
