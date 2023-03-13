package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Latihan;

public class Listing3_UseBMIClass {
    public static void main(String[] args) {
        BMI bmil = new BMI("Kim Yang", 18, 145, 5, 10);
        System.out.println("The BMI for " + bmil.getName() +
                " is " + bmil.getBMI() + " " + bmil.getStatus());

        BMI bmi2 = new BMI("Susan king", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() +
                " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
