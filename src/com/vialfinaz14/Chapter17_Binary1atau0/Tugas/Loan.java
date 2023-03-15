package com.vialfinaz14.Chapter17_Binary1atau0.Tugas;

import java.util.Date;

public class Loan implements java.io.Serializable {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
    @Override
    public String toString() {
        return "Date: " + loanDate + "\nAnnual interest Rate: " +
                annualInterestRate + "\nYears: " + numberOfYears +
                "\nLoan amount: " + loanAmount;
    }
}
//**************************************
// *            Loan                     *
// *-----------------------------------  *
// * -annualInterestRate: double         *
// * -numberOfYears: int                 *
// * -loanAmount: double                 *
// * -loanDate: java.util.Date           *
// * +Loan()                             *
// * +Loan(annualInterestRate: double,   *
// *   numberOfYears: int,loanAmount:    *
// *   double)                           *
// * +getAnnualInterestRate(): double    *
// * +getNumberOfYears(): int            *
// * +getLoanAmount(): double            *
// * +getLoanDate(): java.util.Date      *
// * +setAnnualInterestRate(             *
// *   annualInterestRate: double): void *
// * +setNumberOfYears(                  *
// *   numberOfYears: int): void         *
// * +setLoanAmount(                     *
// * loanAmount: double): void           *
// * +getMonthlyPayment(): double        *
// * +getTotalPayment(): double          *
// * +toString(): String                 *
// **************************************/