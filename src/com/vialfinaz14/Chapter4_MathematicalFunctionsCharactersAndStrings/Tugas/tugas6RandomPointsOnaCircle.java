package com.vialfinaz14.Chapter4.Tugas;

import java.util.Scanner;

public class tugas6RandomPointsOnaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 40;

        double angle = (Math.random() * (2 * Math.PI));
        double x1 = RADIUS * Math.cos(angle);
        double y1 = RADIUS * Math.sin(angle);
        double x2 = RADIUS * Math.cos(angle);
        double y2 = RADIUS * Math.sin(angle);
        double x3 = RADIUS * Math.cos(angle);
        double y3 = RADIUS * Math.sin(angle);

        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3,2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("The three angles are " + Math.round(angleA * 100) / 100.0 + " " +
                Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0);
    }
}
