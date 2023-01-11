package com.vialfinaz14.Chapter5_Loops.Tugas;

import java.util.Scanner;

public class Exercises28DisplayTheFirtsDaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.println("Enter firts day of the year: ");
        int day = input.nextInt();

        String output;
        for (int mont = 1; mont <= 12; mont++) {
            output = "";
            switch (mont) {
                case 1: output += "January "; break;
                case 2: output += "February "; break;
                case 3: output += "Maret "; break;
                case 4: output += "April "; break;
                case 5: output += "Mei "; break;
                case 6: output += "Juni "; break;
                case 7: output += "Juli "; break;
                case 8: output += "Agustus "; break;
                case 9: output += "September "; break;
                case 10: output += "Oktober "; break;
                case 11: output += "November "; break;
                case 12: output += "Desember "; break;
            }
            output += "1, " + year + " is ";

            day %= 7;
            switch (day) {
                case 0: System.out.println(output + "Ahad"); break;
                case 1: System.out.println(output + "Senin"); break;
                case 2: System.out.println(output + "Selasa"); break;
                case 3: System.out.println(output + "Rabu"); break;
                case 4: System.out.println(output + "Kamis"); break;
                case 5: System.out.println(output + "Jum'at"); break;
                case 6: System.out.println(output + "Sabtu"); break;
            }
            if (mont == 1 || mont == 3 || mont == 5 ||
            mont == 7 || mont == 8 || mont == 10 || mont == 12)
                day += 31;
            else if (mont == 4 || mont == 6 || mont == 9 || mont == 11)
                day += 30;
            else {
                if (((year % 4 == 0) && ( year % 100 != 0)) || (year % 400 == 0))
                    day += 29;
                else
                    day += 28;
            }
        }
    }
}
