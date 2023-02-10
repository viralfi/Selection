package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

public class Exercises23_LockerPuzzle {
    public static void main(String[] args) {
        String[] lockers = new String[100];
        closealllocker(lockers);
        studentlockerchang(lockers);
        print(lockers);
    }
    public static boolean isopen(String l) {
        return l == "OPEN";
    }
    public static void closealllocker(String[] locker) {
        for (int i = 0; i < locker.length; i++) {
            locker[i] = "CLOSED";
        }
    }
    public static void studentlockerchang(String[] locker) {
        int start = 0;
        for (int s = 1; s < locker.length; s++) {
            for (int l = 0; l < locker.length; l += s) {
                if (isopen(locker[l]))
                    locker[l] = "CLOSED";
                else
                    locker[l] = "OPEN";
            }
            start++;
        }
    }
    public static void  print(String[] locker) {
        for (int i = 0; i < locker.length; i++) {
            if (isopen(locker[i])) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
        System.out.println();
    }
}
