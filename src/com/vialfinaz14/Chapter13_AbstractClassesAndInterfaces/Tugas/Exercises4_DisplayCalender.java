package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Tugas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercises4_DisplayCalender {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Exercises_13_04 month year");
            System.exit(1);
        }
        Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]),
                Integer.valueOf(args[0]) - 1, 1);
    }
}
