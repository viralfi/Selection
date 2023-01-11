package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;

public class tugas14ConvertLetterGradeToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        String g = input.nextLine();
        char ch = g.charAt(0);
        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'F' && ch != 'E'){
            System.out.println("The numeric value for grade " + ch + " is ");
            switch (ch){
                case 'A':
                    System.out.print(4); break;
                case 'B':
                    System.out.print(3); break;
                case 'C':
                    System.out.print(2); break;
                case 'D':
                    System.out.print(1); break;
                case 'F':
                    System.out.print(0);
            }
        }
        else
            System.out.println(ch + " is an invalid grade");
    }
}
