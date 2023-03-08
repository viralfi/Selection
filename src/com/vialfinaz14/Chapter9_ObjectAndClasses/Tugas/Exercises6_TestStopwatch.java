package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

public class Exercises6_TestStopwatch {
    public static void main(String[] args) {
        StopWatch stopwotch = new StopWatch();
        int[] randomArray = getArray();
        stopwotch.start();
        selectionSort(randomArray);
        stopwotch.stop();
        System.out.println("The execution time of sorting 100,000 " +
                "numbers using selection sort: " + stopwotch.getElapsedTime() +
                 " millisecond");
    }
    public static int[] getArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minindex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minindex = j;
                }
            }
            if (i != minindex) {
                array[minindex] = array[i];
                array[i] = min;
            }
        }
    }
}
