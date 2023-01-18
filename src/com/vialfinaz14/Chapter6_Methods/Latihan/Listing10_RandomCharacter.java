package com.vialfinaz14.Chapter6_Methods.Latihan;

public class Listing10_RandomCharacter {
    public static char getrandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRLCL() {
        return getrandomCharacter('a', 'z');
    }
    public static char getRUCL() {
        return  getrandomCharacter('A', 'Z');
    }
    public static char getRDC() {
        return getrandomCharacter('0', '9');
    }
    public static char getrandomCharacter() {
        return getrandomCharacter('\u0000', '\uFFFF');
    }
}
