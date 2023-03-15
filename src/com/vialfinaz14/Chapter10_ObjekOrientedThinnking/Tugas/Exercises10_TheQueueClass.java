package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

public class Exercises10_TheQueueClass {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
