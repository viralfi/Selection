package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan.example;

import java.text.DecimalFormat;

public class FullTimeEmployee extends Employee{
    private double baseSalary;
    private double bonusPercentage;

    public FullTimeEmployee(Long id, String name, String address, int age, double baseSalary, double bonusPercentage) {
        super(id, name, address, age);
        this.baseSalary = baseSalary;
        this.bonusPercentage = bonusPercentage;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * bonusPercentage / 100);
    }

    @Override
    public void display() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name            : " + getName());
        System.out.println("Address         : " + getAddress());
        System.out.println("Age             : " + getAge());
        System.out.println("Base Salary     : " + df.format(baseSalary));
        System.out.println("Bonus Percentage: " + df.format(bonusPercentage));
        System.out.println("Salary          : " + df.format(calculateSalary()));
    }
}
