package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises29DisplayCalender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = input.nextInt();
        System.out.println("Enter firts day of the year: ");
        int day = input.nextInt();

        String header;
        System.out.println();
        for (int mont = 1; mont <= 12; mont++) {
            header = "";
            switch (mont) {
                case 1: header += "January "; break;
                case 2: header += "February "; break;
                case 3: header += "Maret "; break;
                case 4: header += "April "; break;
                case 5: header += "Mei "; break;
                case 6: header += "Juni "; break;
                case 7: header += "Juli "; break;
                case 8: header += "Agustus "; break;
                case 9: header += "September "; break;
                case 10: header += "Oktober "; break;
                case 11: header += "November "; break;
                case 12:header += "Desember "; break;
            }
            header += year + "";
            for (int b = 0; b < 23 - (header.length() / 2); b++) {
                System.out.println(" ");
            }
            System.out.println(header + "\n--------------------------------------------------\n " +
                    "Sun    Mon    Tue    Wed    Thu    Fri   Sat");
            day %= 7;
            for (int b = 0; b <= day * 7; b++) {
                System.out.print(" ");
            }
            int  lastday = 0;
            if (mont == 1 || mont == 3 || mont == 5 || mont == 7 ||
             mont == 8 || mont == 10 || mont == 12)
                lastday += 31;
            else if (mont == 4 || mont == 6 || mont == 9 || mont == 11)
                lastday = 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || ( year % 400 == 0))
                    lastday = 29;
                else
                    lastday = 28;
            }
            for (int d = 1; d <= lastday; d++) {
                if (d < 10)
                    System.out.print(" ");
                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "     ");

                    if (d == lastday)
                        System.out.println();
                }
                day++;
            }
            System.out.println();
        }
    }
}
