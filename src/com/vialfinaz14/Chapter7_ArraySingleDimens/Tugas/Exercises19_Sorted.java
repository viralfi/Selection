package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

import javax.script.ScriptEngine;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Exercises19_Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        System.out.println("The list is " + (isSortes(list) ? "already " :
                "not ") + "sorted");
    }
    public static boolean isSortes(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
