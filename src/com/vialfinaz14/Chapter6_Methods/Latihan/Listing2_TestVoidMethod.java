package com.vialfinaz14.Chapter6_Methods.Latihan;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Listing2_TestVoidMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilainya adalah ");
        double score = input.nextDouble();
        printGrade(score);
        System.out.print("Nilainya adalah ");
        printGrade(59.5);
    }
    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0){
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
