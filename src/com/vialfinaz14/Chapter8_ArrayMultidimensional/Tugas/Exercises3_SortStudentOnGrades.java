package com.vialfinaz14.Chapter8_ArrayMultidimensional.Tugas;

public class Exercises3_SortStudentOnGrades {
    public static void main(String[] args) {
        char[][] answars = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] correctcount = new int[answars.length][2];

        for (int i = 0; i < answars.length; i++) {
            for (int j = 0; j < answars[i].length; j++) {
                if (answars[i][j] == keys[j]) {
                    correctcount[i][0] = i;
                    correctcount[i][1]++;
                }
            }
        }
        sort(correctcount);
        for (int row = 0; row < correctcount.length; row++) {
            System.out.println("Student " + correctcount[row][0] +
                     "'s correct count is " + correctcount[row][1]);
        }
    }
    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int mincol1 = m[i][1];
            int mincol0 = m[i][0];
            int minindex = i;

            for (int j = i + 1; j < m.length; j++) {
                if (mincol1 > m[j][1]) {
                    mincol1 = m[j][1];
                    mincol0 = m[j][0];
                    minindex = j;
                }
            }
            if (minindex != i) {
                m[minindex][1] = m[i][1];
                m[minindex][0] = m[i][0];
                m[i][1] = mincol1;
                m[i][0] = mincol0;
            }
        }
    }
}
