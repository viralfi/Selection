import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KilogramPerPound = 0.45359237;
        final double MeterPerInch = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        weight = weight * KilogramPerPound;
        height = height * MeterPerInch;

        double bodyMassIndex = weight / Math.pow(height, 2);
        System.out.print("BMI is ");
        System.out.printf("%.4f", bodyMassIndex);
    }
}