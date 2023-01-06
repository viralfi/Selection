import java.util.Scanner;

public class Soal21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);
        System.out.println("Accumulated value is $ " + futureInvestmentValue);
    }
}