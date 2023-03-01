package com.vialfinaz14.Chapter12_ExceptionHandlingAndText10.Latihan;

import java.util.Scanner;

public class Listing15_ReadData {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("scores.txt");
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastname = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastname +
                    " " + score);
        }
        input.close();
    }
}
