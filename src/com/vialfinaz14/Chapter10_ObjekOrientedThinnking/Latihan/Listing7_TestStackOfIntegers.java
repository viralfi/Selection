package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Latihan;

public class Listing7_TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfInteger stack = new StackOfInteger();
        for (int i = 0; i < 10; i++)
            stack.push(i);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
