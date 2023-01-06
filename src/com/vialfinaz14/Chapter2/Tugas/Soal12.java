import java.util.Scanner;

public class Soal12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is " + String.format("%.3f", length));
    }
}