package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

import java.util.Date;

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
public class Account {
    private int id;
    private double balace;
    private static double annualInterestRate;
    private Date dateCreated;
    Account() {
        id = 0;
        balace = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account(int newId, double newBalance) {
        id = newId;
        balace = newBalance;
        dateCreated = new Date();
    }
    public void setId(int newId) {

        id = newId;
    }
    public void setBalace(double newBalance) {
        balace = newBalance;
    }
    public void setAnnualInterestRate(double NewAnnualInterestRate) {
        annualInterestRate = NewAnnualInterestRate;
    }
    public int getId() {
        return id;
    }

    public double getBalace() {
        return balace;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }
    public double getMonthlyInteresrRate() {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return  balace * (getMonthlyInteresrRate() / 100);
    }
    public void withdraw(double amount) {
        balace -= amount;
    }
    public void deposit(double amount) {
        balace += amount;
    }
}
