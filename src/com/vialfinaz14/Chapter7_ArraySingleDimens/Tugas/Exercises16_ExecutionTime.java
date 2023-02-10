package com.vialfinaz14.Chapter7_ArraySingleDimens.Tugas;

public class Exercises16_ExecutionTime {
    public static void main(String[] args) {
        int num;
        int[] numbers = new int[10000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getrandomint();
        }
        int key = getrandomint();
        int searchresult;
        long starttime = System.currentTimeMillis();
        searchresult = linearsearch(numbers, key);
        long endtime = System.currentTimeMillis();
        long executiontime = endtime - starttime;
        System.out.println("Execution time of invoking the linearsearch " +
                "in milliseconds: " + executiontime);
        selectionsort(numbers);

        starttime = System.currentTimeMillis();
        searchresult = binarysearch(numbers, key);
        endtime = System.currentTimeMillis();
        executiontime = endtime - starttime;
        System.out.println("Execution time of invoking the binarysearch in " +
                "millisecond: " + executiontime + " ");
    }
    public static int getrandomint() {
        return 1 + (int) (Math.random() * 100000);
    }
    public static int linearsearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
    public static int binarysearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < mid)
                high = mid - 1;
            else if (key == mid)
                return mid;
            else
                low = mid +1;
        }
        return - low - 1;
    }
    public static void selectionsort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minindex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    minindex = j;
                }
            }
            if (minindex != i) {
                array[minindex] = array[i];
                array[i] = min;
            }
        }
    }
}
