package com.vialfinaz14.Chapter4;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Escape {
    public static void main(String[] args) {
        System.out.println("Hello to me");
        System.out.println("Hello \bto me");
        System.out.println("\tHello to me");
        System.out.println("Hello to \nme");
        System.out.println("Hello to \fme\f");
        System.out.println("Hello to \rme");
        System.out.println("Hello to \\me\\");
    }
}
