package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Latihan;

public class Listing2_Loan {
    private double annualinterestrate;
    private int numberofyears;
    private double loanamount;
    private java.util.Date loandate;

    public Listing2_Loan() {
        this(2.5, 1, 1000);
    }
    public Listing2_Loan(double annualinterestrate, int numberofyears,
                         double loanamount) {
        this.annualinterestrate = annualinterestrate;
        this.numberofyears = numberofyears;
        this.loanamount = loanamount;
        loandate = new java.util.Date();
    }
    public double getAnnualinterestrate() {
        return annualinterestrate;
    }
    public void setAnnualinterestrate(double annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }
    public int getNumberofyears() {
        return numberofyears;
    }
    public void setNumberofyears(int numberofyears) {
        this.numberofyears = numberofyears;
    }
    public double getLoanamount() {
        return loanamount;
    }
    public void setLoanamount(double loanamount) {
        this.loanamount = loanamount;
    }
    public double getmonthlypayment() {
        double monthlyinteresrate = annualinterestrate / 1200;
        double monthlypayment = loanamount * monthlyinteresrate / (1 -
                (1 / Math.pow(1 + monthlyinteresrate, numberofyears * 12)));
        return monthlypayment;
    }
    public double gettotalpayment() {
        double totalpayment = getmonthlypayment() * numberofyears * 12;
        return totalpayment;
    }
    public java.util.Date getLoandate() {
        return loandate;
    }
}
