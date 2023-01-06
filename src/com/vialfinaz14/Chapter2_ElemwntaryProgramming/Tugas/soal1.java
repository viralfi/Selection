import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degreee in Celsius: ");
        double celsius = input.nextDouble();

        double Fahrenheit = 9.0 / 5 * celsius + 32;
        System.out.println(+ celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
    }
}