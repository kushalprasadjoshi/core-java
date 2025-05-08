package chap07advancedconcepts;

import java.util.Calendar;
import java.util.TimeZone;

public class Eg24CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));

        System.out.println();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        System.out.println();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone().getID());
    }
}
