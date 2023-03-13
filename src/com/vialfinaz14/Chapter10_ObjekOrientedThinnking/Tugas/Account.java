package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date datecreated;
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        datecreated = new Date();
    }
    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        datecreated = new Date();
    }
    public void setId(int newid) {
      id = newid;
    }
    public void setBalance(double newbalance) {
       balance = newbalance;
    }
    public static void setAnnualInterestRate(double newannualInterestRate) {
        annualInterestRate = newannualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDatecreated() {
        return datecreated;
    }
    public double getMonthlyInterestRate() {
        return balance * (getMonthlyInterestRate() / 100);
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance -= amount;
    }
}
///********************************************************
// *                     Account                           *
// *-------------------------------------------------------*
// * -id: int                                              *
// * -balance: double                                      *
// * -annualInterestRate: double                           *
// * ---------------------------                           *
// * -dateCreated: String                                  *
// * +Account()                                            *
// * +Account(newid: int, newBalance: double)              *
// * +setId(newId: int)                                    *
// * +setBalance(newBalance: double)                       *
// * +setAnnualInterestRate(newAnnualInterestRate: double) *
// * +getId(): int                                         *
// * +getBalance(): double                                 *
// * +getAnnualInterestRate(): double                      *
// * +getDateCreated(): String                             *
// * +getMonthlyInterestRate(): double                     *
// * +getMonthlyInterest(): double                         *
// * +withdraw(amount: double)                             *
// * +deposit(amount: double)                              *
// ********************************************************/