import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double MeterPerFoot = 0.305;

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meters = feet * MeterPerFoot;
        System.out.println(feet + " feet is " + meters + " meters");

    }
}