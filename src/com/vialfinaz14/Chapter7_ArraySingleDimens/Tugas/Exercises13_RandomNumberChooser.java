package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

public class Exercises13_RandomNumberChooser {
    public static int getRandom(int... numbers) {
        int num;
        boolean isExcluded;
        do {
            isExcluded = false;
            num = 1 + (int) (Math.random() * 5);
            for (int e: numbers) {
                if (num == e)
                    isExcluded = true;
            }
        }while (isExcluded);
        return num;
    }
}
