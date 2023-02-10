package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;

public class Exercises22_EightQueens {
    public static void main(String[] args) {
        char[] board;
        do {
            board = getnewboard();
            placequeens(board);
        }while (isattacking(board));
        print(board);
    }
    public static void placequeens(char[] board) {
        int location;
        for (int i = 0; i < 8; i++) {
            do {
                location = placequeens();
            }while (isoccupied(board[location]));
            board[location] = 'Q';
        }
    }
    public static int placequeens() {
        return (int) (Math.random() * 64);
    }
    public static boolean isattacking(char[] board) {
        return issamerow(board) || issamecolum(board) || issamediagonal(board);
    }
    public static boolean issamerow(char[] board) {
        int[] rows = new int[8];
        for (int i = 0; i < board.length; i++) {
            if (isoccupied(board[i])) {
                rows[getrow(i)]++;
            }
            if (rows[getrow(i)] > 1)
             return true;
        }
        return false;
    }
    public static boolean issamecolum(char[] board) {
        int[] colums = new  int[8];
        for (int i = 0; i < board.length; i++) {
            if (isoccupied(board[i])) {
                colums[getcolum(i)]++;
            }
            if (colums[getcolum(i)] > 1)
                return true;
        }
        return  false;
    }
    public static boolean issamediagonal(char[] board) {
        for (int i = 0; i < board.length; i++)  {
            if (isoccupied(board[i])) {
                for (int j = 0; j < board.length; j++) {
                    if (isoccupied(board[j]) && Math.abs(getcolum(j) -
                            getcolum(i)) == Math.abs(getrow(j) -
                            getrow(i)) && j != i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean isoccupied(char x) {
        return x == 'Q';
    }
    public static char[] getnewboard() {
        char[] board = new char[64];
        for (int i = 0; i < board.length;i++)
            board[i] = ' ';
        return board;
    }
    public static void print(char[] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("|" + ((getrow(i + 1) == 0) ? board[i] +
                    "|\n" : board[i]));
        }
    }
    public static int getrow(int index) {
        return index % 8;
    }
    public static int getcolum(int index) {
        return index / 8;
    }
}
