package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

import java.util.Date;

public class StackOfInteger {
    private int[] element;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;
    public StackOfInteger() {
        this(DEFAULT_CAPACITY);
    }
    public StackOfInteger(int capacity) {
        element = new int[capacity];
    }
    public void push(int value) {
        if (size >= element.length) {
            int[] temp = new int[element.length * 2];
            System.arraycopy(element, 0, temp, 0, element.length);
            element = temp;
        }
        element[size++] = value;
    }
    public int pop() {
        return element[--size];
    }
    public int peek() {
        return element[size - 1];
    }
    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
}
