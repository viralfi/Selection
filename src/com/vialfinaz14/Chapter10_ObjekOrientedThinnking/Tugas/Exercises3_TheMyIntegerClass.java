package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

public class Exercises3_TheMyIntegerClass {
    public static void main(String[] args) {
        int[] values = {5, 6, 7, 8, 9};
        System.out.println("\nTest if values are even using isEven(int): ");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
        }
        System.out.println("\nTest if values are odd using isOdd(int): ");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
        }
        System.out.println("\nTest if values are prime using isPrime(int): ");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
        }
        System.out.println("\nTest if values are even using isEven(): ");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isEven());
        }
        System.out.println("\nTest if values are odd using isOdd(): ");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isOdd());
        }
        System.out.println("\nTest if values are prime using isPrime(): ");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isPrime());
        }
        System.out.println("\nTest if values are even using isEven(MyInteger): ");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isEven(value));
        }
        System.out.println("\nTest if values are odd using isOdd(MyInteger): ");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
        }
        System.out.println("\nTest if values are prime using isPrime(MyInteger): ");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
        }
        int[] value2 = {5, 9, 7};
        MyInteger value = new MyInteger(9);
        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value: ");
        for (int i = 0; i < value2.length; i++) {
            System.out.println(value2[i] + " " + value.equals(value2[i]));
        }
        System.out.println("\nTest if " + value.getValue() +
                " is equal to the specified value: ");
        for (int i = 0; i < value2.length; i++) {
            MyInteger myInteger = new MyInteger(values[i]);
            System.out.println(value2[i] + " " + value.equals(myInteger));
        }
        System.out.println("\nTest parseInt(char[]) and parseInt(String): ");
        char[] numericCharacter = {'3', '4', '2'};
        String numeriString = "658";
        System.out.print("\'");
        for (int i = 0; i < numericCharacter.length; i++) {
            System.out.print(numericCharacter[i] + "");
        }
        System.out.println("\' + \"" + numeriString + "\" = " +
                (MyInteger.parseInt(numericCharacter) +
                        MyInteger.parseInt(numeriString)));
    }
}
///*********************************************************************************
// * (The MyInteger class) Design a class named MyInteger. The class contains:      *
// *                                                                                *
// * ■ An int data field named value that stores the int value represented by this  *
// *   object.                                                                      *
// * ■ A constructor that creates a MyInteger object for the specified int value.   *
// * ■ A getter method that returns the int value.                                  *
// * ■ The methods isEven(), isOdd(), and isPrime() that return true if the         *
// *   value in this object is even, odd, or prime, respectively.                   *
// * ■ The static methods isEven(int), isOdd(int), and isPrime(int) that            *
// *   return true if the specified value is even, odd, or prime, respectively.     *
// * ■ The static methods isEven(MyInteger), isOdd(MyInteger), and                  *
// *   isPrime(MyInteger) that return true if the specified value is even, odd,     *
// *   or prime, respectively.                                                      *
// * ■ The methods equals(int) and equals(MyInteger) that return true if            *
// *   the value in this object is equal to the specified value.                    *
// * ■ A static method parseInt(char[]) that converts an array of numeric           *
// *   characters to an int value.                                                  *
// * ■ A static method parseInt(String) that converts a string into an int          *
// *   value.                                                                       *
// *                                                                                *
// * Draw the UML diagram for the class and then implement the class. Write a       *
// * client program that tests all methods in the class.                            *
// *********************************************************************************/