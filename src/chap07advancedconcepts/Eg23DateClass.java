package chap07advancedconcepts;

import java.util.Date;  // This is depreciated

public class Eg23DateClass {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
