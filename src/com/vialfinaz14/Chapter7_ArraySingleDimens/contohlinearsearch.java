package com.vialfinaz14.Chapter7_ArraySingleDimens;

public class contohlinearsearch {
    public static void main(String[] args) {
        int[] list = {5, 4, 6, 3, 9, 6, 3, 4};
        int key = 4;

        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                System.out.println("list["+i+"] = " + list[i] +
                        " = " + key +
                        " data ditemukan");continue;
            }
            System.out.println("list[" + i + "] = "  + list[i] +
                    " = " + key);
        }
    }
}
