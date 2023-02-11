package com.vialfinaz14.Chapter8_ArrayMultidimensional.Latihan;

import java.util.Scanner;

public class Listing5_Weather {
    public static void main(String[] args) {
        final int  NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);
        for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperatur = input.nextDouble();
            double humidity = input.nextDouble();
            data[day - 1][hour - 1][0] = temperatur;
            data[day - 1][hour - 1][1] = humidity;
        }
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailytemperaturetotal = 0, dairyhumiditytotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailytemperaturetotal += data [i][j][0];
                dairyhumiditytotal += data[i][j][1];
            }
            System.out.println("Day " + i + " 's average temperature is " +
                     dailytemperaturetotal / NUMBER_OF_HOURS);
            System.out.println("Day " + i + " 's average humidity is " +
                    dairyhumiditytotal / NUMBER_OF_HOURS);
        }
    }
}
