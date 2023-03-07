package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan.example;

import java.text.DecimalFormat;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWork;

    public PartTimeEmployee(Long id, String name, String address, int age, double hourlyRate, int hoursWork) {
        super(id, name, address, age);
        this.hourlyRate = hourlyRate;
        this.hoursWork = hoursWork;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWork;
    }

    @Override
    public void display() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name            : " + getName());
        System.out.println("Address         : " + getAddress());
        System.out.println("Age             : " + getAge());
        System.out.println("Base Salary     : " + df.format(hourlyRate));
        System.out.println("Bonus Percentage: " + df.format(hoursWork));
        System.out.println("Salary          : " + df.format(calculateSalary()));
    }
}
