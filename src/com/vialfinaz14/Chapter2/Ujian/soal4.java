import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tinngi badan: ");
        double tb = input.nextDouble();
        System.out.print("Berat badan: ");
        double bb = input.nextDouble();

        double BL = (tb - 100) - (0.1 * (tb - 100));
        double BP = (tb - 100) - (0.15 * (tb - 100));
        double tbm = tb / 100;
        double BMI = bb / Math.pow(tbm, 2);

        System.out.println("Berat badan ideal anda adalah (l) " + BL + " kg");
        System.out.println("Berat badan ideal anda adalah (p) " + BP + " kg");
        System.out.println("Nilai BMI tubuh anda adalah " + String.format("%.2f", BMI));
    }
}