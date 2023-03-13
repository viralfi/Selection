package com.vialfinaz14.Chapter10_ObjekOrientedThinnking.Tugas;

public class Tax {
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;
    Tax() {
        filingStatus = SINGLE_FILER;
        double[] currentYearRtaes = {10, 15, 25, 28, 33, 35};
        setRates(currentYearRtaes);
        int[][] currentYearBrackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};
        setBrackets(currentYearBrackets);
        taxableIncome = 0;
    }
    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFillingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }
    public void setFillingStatus(int filingStatus) {
        this.filingStatus =filingStatus;
    }
    public int getFilingStatus() {
        return filingStatus;
    }
    public void setBrackets(int[][] brackets) {
        this.brackets = new int[brackets.length][brackets[0].length];
        for (int i = 0; i < brackets.length; i++) {
            for (int j= 0; j < brackets[i].length; j++)
                this.brackets[i][j] = brackets[i][j];
        }
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        for (int i = 0; i < rates.length; i++)
            this.rates[i] = rates[i] / 100;
    }

    public double[] getRates() {
        return rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    public double getTax() {
        double tax = 0, incomeTaxed = 0;
        double income = taxableIncome;
        if (rates.length >= 2) {
            for (int i = rates.length - 2; i >= 0; i--) {
                if (income > brackets[filingStatus][i]) {
                    tax += (incomeTaxed = income - brackets[filingStatus][i]) *
                            rates[i * 1];
                    income -= incomeTaxed;
                }
            }
        }
        return tax += brackets[filingStatus][0] * rates[0];
    }
}
///************************************************
// *                   Tax                         *
// *-----------------------------------------------*
// * -filingStatus: int                            *
// * +SINGLE_FILER: int                            *
// * ------------------                            *
// * +MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER): int *
// * --------------------------------------------- *
// * +MARRIED_SEPARATELY: int                      *
// * ------------------------                      *
// * +HEAD_OF_HOUSEHOLD: int                       *
// * -----------------------                       *
// * -brackets: int[][]                            *
// * -rates: double[]                              *
// * -taxableIncome: double                        *
// * +Tax()                                        *
// * +Tax(filingStatus: int, brackets: int[][],    *
// *      rates: double[], taxableIncome: double)  *
// * +getFilingStatus(): int                       *
// * +setFilingStatus(status: int)                 *
// * +getBrackets(): int[][]                       *
// * +setBrackets(brackets: int[][])               *
// * +getRates(): int[]                            *
// * +setRates(rates: int[])                       *
// * +getTaxableIncome(): double                   *
// * +setTaxableIncome(taxableIncome: double)      *
// * +getTax(): double                             *
// ************************************************/