package com.vialfinaz14.Chapter8_ArrayMultidimensional.Tugas;

public class Exercises4_ComputeTheweeklyHoursForEachEmployee {
    public static void main(String[] args) {
int[][] weeklyHours = {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9},};

int[][] totalhours = sumrows(weeklyHours);
sort(totalhours);
print(totalhours);
    }
    public static int[][] sumrows(int[][] m) {
        int[][] total = new int[m.length][2];
        for (int row = 0; row < m.length; row++) {
            total[row][0] = row;
            total[row][1] = 0;
            for (int col = 0; col < m[row].length; col++) {
                total[row][1] += m[row][col];
            }
        }
        return total;
    }
    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int maxcol0 = m[i][0];
            int maxcol1 = m[i][1];
            int maxindex = i;
            for (int j = 0; j < m.length; j++) {
                if (maxcol1 < m[j][1]) {
                    maxcol1 = m[j][1];
                    maxcol0 = m[j][0];
                    maxindex = j;
                }
            }
            if (i != maxindex) {
                m[maxindex][1] = m[i][1];
                m[maxindex][0] = m[i][0];
                m[i][1] = maxcol1;
                m[i][0] = maxcol0;
            }
        }
    }
    public static void print(int[][] m) {
        System.out.println("Employee    weekly Hours");
        System.out.println("------------------------");
        for (int row = 0; row < m.length; row++) {
            System.out.printf("%4d%16d\n", m[row][0], m[row][1]);
        }
    }
}
