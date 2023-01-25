package com.vialfinaz14.Chapter6_Methods.Tugas;

public class Exercises11_ComputeCommissions {
    public static void main(String[] args) {
        System.out.println("\n SalesAmount    Commision");
        System.out.println("----------------------------");
        for (double salesAmount = 10000; salesAmount <= 100000;
             salesAmount += 5000) {
            System.out.printf(" %-16.0f", salesAmount);
            System.out.printf("%8.1f\n", computerCommision(salesAmount));
        }
    }
    public static double computerCommision(double salesAmount) {
        double balance, commisiom;
        balance = commisiom = 0.0;
        if (salesAmount >= 10000.01)
            commisiom += (balance = salesAmount - 10000) * 0.12;
        if (salesAmount >= 5000.01)
            commisiom += (balance -= balance - 5000) * 0.10;
        if (salesAmount >= 0.01)
            commisiom += balance * 0.08;
        return commisiom;
    }
}
