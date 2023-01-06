import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka dari 1000 sampai 9999: ");
        int number = input.nextInt();

        int lastThen10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int seribu = number % 10;
        number /= 10;
        int sejuta = number % 10;
        number /= 10;

        int hasil = lastThen10 + tens + seribu + sejuta;
        System.out.println("Jadi hasil jumlah dari ke empat bilangan adalah " + hasil);


    }
}