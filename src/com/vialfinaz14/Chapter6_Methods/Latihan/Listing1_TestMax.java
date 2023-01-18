package com.vialfinaz14.Chapter6_Methods.Latihan;

public class Listing1_TestMax {
    public static void main(String[] args) {
        int i = 5, j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " +
                j + " is " + k);
    }
    public static int max(int numl, int num2) {
        int result;
        if (numl > num2)
            result = numl;
        else
            result = num2;
        return result;
    }
}
