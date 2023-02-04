package com.vialfinaz14.Chapter6_Methods.Ujian;

import org.jetbrains.annotations.NotNull;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Ujian3_MenkonversiJenisBilangan {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String in = null, out = null, finalresult = null, number = null;

        int menu = pilihMenu();
        switch (menu) {
            case 1 -> {
                in = "binary";
                out = "oktal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 2 -> {
                in = "binary";
                out = "decimal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 3 -> {
                in = "binary";
                out = "hexdecimal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 4 -> {
                in = "octal";
                out = "binary";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 5 -> {
                in = "octal";
                out = "decimal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 6 -> {
                in = "octal";
                out = "hexdecimal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 7 -> {
                in = "decimal";
                out = "binary";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 8 -> {
                in = "decimal";
                out = "octal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 9 -> {
                in = "decimal";
                out = "hexdecimal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 10 -> {
                in = "hexdecimal";
                out = "binary";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 11 -> {
                in = "hexdecimal";
                out = "octal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
            case 12 -> {
                in = "hexdecimal";
                out = "decimal";
                number = inputnumber(in, out);
                boolean result = checkinput(number, in);
                finalresult = convertnumber(result, number, in, out);
            }
        }
        assert finalresult != null;
        if (finalresult.equals("Error")) {
            System.out.println("Input yang anda masukan salah");
        } else {
            System.out.println(number.toUpperCase() + " in " + in + " is " + finalresult.toUpperCase() + " in " + out);

        }
    }

    private static int pilihMenu() {
        System.out.println("=========MENU=========");
        System.out.println("1. Biner    ke Oktal");
        System.out.println("2. Biner    ke Desimal");
        System.out.println("3. Biner    ke Heksa");
        System.out.println("4. Oktal    ke Biner");
        System.out.println("5. Oktal    ke Desimal");
        System.out.println("6. Oktal    ke Heksa");
        System.out.println("7. Desimal  ke Biner");
        System.out.println("8. Desimal  ke Oktal");
        System.out.println("9. Desimal  ke Heksa");
        System.out.println("10.Heksa    ke Biner");
        System.out.println("11.Heksa    ke Oktal");
        System.out.println("12.Heksa    ke Desimal");

        System.out.print("Masukan menu: ");
        return input.nextInt();
    }

    public static String inputnumber(String in, String out) {
        String number;
        System.out.println(in + " -> " + out);
        System.out.println("Input " + in + " Number : ");
        number = input.next();
        return number;
    }
    public static String convertnumber(boolean result, String number, String in, String out) {
        String finalresult;
        if (result) {
            if (in.equals("binary") && out.equals("octal")) {
                finalresult = binkeoct(number);
            } else if (in.equals("binary") && out.equals("decimal")) {
                finalresult = String.valueOf(binkedes(number));
            } else if (in.equals("binary") && out.equals("hexdecimal")) {
                finalresult = binkehek(number);
            } else if (in.equals("octal") && out.equals("binary")) {
                finalresult = oktkebin(number);
            } else if (in.equals("octal") && out.equals("decimal")) {
                finalresult = oktkedes(number);
            } else if (in.equals("octal") && out.equals("hexdecimal")) {
                finalresult = oktkeheks(number);
            } else if (in.equals("decimal") && out.equals("binary")) {
                finalresult = deskebin(number);
            } else if (in.equals("decimal") && out.equals("octal")) {
                finalresult = deskeokt(number);
            } else if (in.equals("decimal") && out.equals("hexdecimal")) {
                finalresult = deskehex(number);
            } else if (in.equals("hexdecimal") && out.equals("binary")) {
                finalresult = hekskebin(number);
            } else if (in.equals("hexdecimal") && out.equals("octal")) {
                finalresult = hekskeokt(number);
            } else if (in.equals("hexdecimal") && out.equals("decimal")) {
                finalresult = hekskedes(number);
            } else {
                finalresult = " error";
            }
        } else {
            finalresult = "Error";
        }
        return finalresult;
    }

    public static boolean checkinput(String number, String check) {
        switch (check) {
            case "binary" -> {
                return number.matches("[01]+");
            }
            case "decimal" -> {
                return number.matches("-?\\d+(\\.\\d+)?");
            }
            case "hexdecimal" -> {
                return number.matches("^[0-9a-fA-F]+$");
            }
            case "octal" -> {
                return number.matches("^[0-7]+$");
            }
            default -> {
                try {
                    throw new IllegalAccessException("unexpected value: " + check);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    private static int binkedes(String number) {
        return Integer.parseInt(String.valueOf(number), 2);
    }

    private static String binkeoct(String number) {
        int decimal = Integer.parseInt(String.valueOf(number), 2);
        return Integer.toOctalString(decimal);
    }

    private static String binkehek(String number) {
        int decimal = Integer.parseInt(String.valueOf(number), 2);
        return Integer.toHexString(decimal);
    }
    public static String oktkebin(String number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            StringBuilder binPart = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                binPart.insert(0, (digit & 1));
                digit = digit >> 1;
            }
            binary.append(binPart);
        }
        return binary.toString();
    }
    public static String oktkedes(String number) {
        StringBuilder decimal = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit = c - '0';
            decimal.append(digit * Math.pow(8, number.length() - i - 1));
        }

        return decimal.toString();
    }
    public static String deskebin(String number) {
        int decimal = Integer.parseInt(number);
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            long rem = decimal % 2;
            binary.insert(0, rem);
            decimal = decimal / 2;
        }
        return binary.toString();
    }
    public static String deskeokt(String number) {
        int decimal = Integer.parseInt(number);
        return Integer.toOctalString(decimal);
    }
    public static String deskehex(String number) {
       int decimal = Integer.parseInt(number);
       return Integer.toHexString(decimal);
    }
    public static String oktkeheks(String number) {
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit = c - '0';
            decimal += digit * Math.pow(8, number.length() - i - 1);
        }
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            long remainder = decimal % 16;
            hex.insert(0, hexChars[(int) remainder]);
            decimal = decimal / 16;
        }

        return hex.toString();
    }
    public static String hekskeokt(String number) {
        int decimal = 0;
        number = number.toUpperCase();
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
            }
            decimal += digit * Math.pow(16, number.length() - i - 1);
        }
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            octal.insert(0, (decimal & 7));
            decimal = decimal >> 3;
        }

        return octal.toString();
    }
    public static String hekskedes(String number) {
        number = number.toUpperCase();
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                throw new IllegalArgumentException("Invalid hexadecimal digit: " + c);
            }
            decimal += digit * Math.pow(16, number.length() - i - 1);
        }

        return String.valueOf(decimal);
    }
    public static String hekskebin( String number) {
        number = number.toUpperCase();
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
           char c = number.charAt(i);
            switch (c) {
                case '0' -> binary.append("0000");
                case '1' -> binary.append("0001");
                case '2' -> binary.append("0010");
                case '3' -> binary.append("0011");
                case '4' -> binary.append("0100");
                case '5' -> binary.append("0101");
                case '6' -> binary.append("0110");
                case '7' -> binary.append("0111");
                case '8' -> binary.append("1000");
                case '9' -> binary.append("1001");
                case 'A' -> binary.append("1010");
                case 'B' -> binary.append("1011");
                case 'C' -> binary.append("1100");
                case 'D' -> binary.append("1101");
                case 'E' -> binary.append("1110");
                case 'F' -> binary.append("1111");
            }
        }
        return String.valueOf(binary);
    }
}
