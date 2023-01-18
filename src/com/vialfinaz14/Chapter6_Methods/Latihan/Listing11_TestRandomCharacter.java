package com.vialfinaz14.Chapter6_Methods.Latihan;

public class Listing11_TestRandomCharacter {
    public static void main(String[] args) {
        final int NOC = 175;
        final int CPL = 25;

        for (int i = 0; i < NOC; i++) {
            char ch = Listing10_RandomCharacter.getRLCL();
            if ((i + 1) % CPL == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
