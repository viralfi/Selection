package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;

public class tugas17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter a mont: ");
        String month = input.next();

        boolean leapyear = ((year % 4 == 0) && (year % 100 != 0))
                || (year % 400 == 0);
        System.out.print(month + " " + year + " has ");
        if (month.equals("Jan") || month.equals("Mar") || month.equals("May")
                || month.equals("Jul") || month.equals("Aug") || month.equals("Oct")
                || month.equals("Dec"))
            System.out.print(31 + " days");
        else if (month.equals("Apr") || month.equals("Jun")
                || month.equals("Sep") || month.equals("Nov"))
            System.out.print(30 + "days");
        else
            System.out.println(((leapyear) ? 29 : 28) + " days");
    }
}
