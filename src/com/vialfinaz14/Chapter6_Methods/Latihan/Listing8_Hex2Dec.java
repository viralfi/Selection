package com.vialfinaz14.Chapter6_Methods.Latihan;

import java.util.Scanner;

public class Listing8_Hex2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai hexa: ");
        String hex = input.nextLine();
        System.out.println("Nilai desimal untuk nilai hexa " +
                hex + " adalah " + htd(hex.toUpperCase()));
    }
    public static int htd(String hex) {
        int dv = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hc = hex.charAt(i);
            dv = dv *16 + hexchartodecimal(hc);
        }
        return dv;
    }
    public static int hexchartodecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
