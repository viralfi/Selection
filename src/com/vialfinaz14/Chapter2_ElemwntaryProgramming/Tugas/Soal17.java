import java.util.Scanner;

public class Soal17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in fahrenheit between -58 F and 41 F: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in mile per hour: ");
        double speed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);
        System.out.println("The wind chill index is " + String.format("%.5f", windChill));
    }
}