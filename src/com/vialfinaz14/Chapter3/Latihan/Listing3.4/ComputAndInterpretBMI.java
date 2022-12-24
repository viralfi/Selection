import java.util.Scanner;

public class ComputAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan berat badan: ");
        double bb = input.nextDouble();
        System.out.print("Masukan ting badan: ");
        double tb = input.nextDouble();

        final double kilogramPerFound = 0.45359237;
        final double metersPerInch = 0.0254;

        double beratPerKilogram = bb * kilogramPerFound;
        double tinggiPerMeters = tb * metersPerInch;
        double BMI = beratPerKilogram / (tinggiPerMeters * tinggiPerMeters);

        System.out.println("BMI isn " + String.format("%.2f", BMI));
        if (BMI < 18.5)
        System.out.println("KURUS");
        else if (BMI < 25)
        System.out.println("NORMAL");
        else if (BMI < 30)
        System.out.println("GENDUT");
        else
        System.out.println("OBESE");
    }
}