import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MonthlyInterestRate = 0.00417;

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();

        double total = 100 * (1 + MonthlyInterestRate);
        total = (100 + total) * (1 + MonthlyInterestRate);
        total = (100 + total) * (1 + MonthlyInterestRate);
        total = (100 + total) * (1 + MonthlyInterestRate);
        total = (100 + total) * (1 + MonthlyInterestRate);
        total = (100 + total) * (1 + MonthlyInterestRate);

        System.out.println("After the six month, the account value is $ " + String.format("%.2f", total));
    }
}