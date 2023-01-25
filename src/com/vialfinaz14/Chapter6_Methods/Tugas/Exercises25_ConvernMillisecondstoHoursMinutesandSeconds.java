package com.vialfinaz14.Chapter6_Methods.Tugas;

import java.util.Scanner;

public class Exercises25_ConvernMillisecondstoHoursMinutesandSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter milliseconds: ");
        long millis = input.nextLong();
        System.out.println("hours : minuties : seconds: " + convertmillis(millis));
    }
    public static String convertmillis(long millis) {
        millis /= 1000;
        String current = "";
        for (int i = 0; i < 2; i++) {
            current = ":" + millis % 60 + current;
            millis /= 60;
        }
        return  millis + current;
    }
}
