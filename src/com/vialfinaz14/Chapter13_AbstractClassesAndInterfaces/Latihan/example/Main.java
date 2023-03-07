package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan.example;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee(
            1L,
            "Andre",
            "Majalengka",
            23,
            10_000_000,
            5
        );

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee(
                1L,
                "Ahmad",
                "Cirebon",
                32,
                30_000,
                8
        );

        System.out.println("Full Time Employee");
        fullTimeEmployee1.display();
        System.out.println("====================================");
        System.out.println("Part Time Employee");
        partTimeEmployee1.display();
    }
}
