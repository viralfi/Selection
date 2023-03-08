package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan;

import java.math.BigInteger;

public class Listing8_SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Bostom", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.println(city + " ");
        System.out.println();

        BigInteger[] hungeNumbers = {new BigInteger("2323231092923992"),
        new BigInteger("432232323239292"),
        new BigInteger("54623239292")};
        java.util.Arrays.sort(hungeNumbers);
        for (BigInteger number: hungeNumbers)
            System.out.println(number + " ");
    }
}
