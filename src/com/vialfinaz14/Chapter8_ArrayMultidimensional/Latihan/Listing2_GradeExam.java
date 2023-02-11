package com.vialfinaz14.Chapter8_ArrayMultidimensional.Latihan;

public class Listing2_GradeExam {
    public static void main(String[] args) {
        char[][] answare = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys =  {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (int i = 0; i < answare.length; i++) {
            int correctcount = 0;
            for (int j = 0; j < answare[i].length; j++) {
                if (answare[i][j] == keys[j])
                    correctcount++;
            }
            System.out.println("Student " + i + " 'is correct count is " +
                    correctcount);
        }
    }
}
