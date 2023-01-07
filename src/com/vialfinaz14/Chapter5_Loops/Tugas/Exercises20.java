package com.vialfinaz14.Chapter5_Loops.Tugas;

public class Exercises20 {
    public static void main(String[] args) {
        final int NOPPL = 8;
        int count = 0;

        System.out.println("The prima numbers between 2 and 1,000, inclusive are \n");
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count % NOPPL == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
        }
    }
}
