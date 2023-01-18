package com.vialfinaz14.Chapter4.Ujian;

import java.util.Scanner;

public class Ujian1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=======MENU======");
        System.out.println("1.Biner   ke Oktal");
        System.out.println("2.Biner   ke Desimal");
        System.out.println("3.Biner   ke heksa");
        System.out.println("4.Oktal   ke Biner");
        System.out.println("5.Oktal   ke Desimal");
        System.out.println("6.Oktal   ke Heksa");
        System.out.println("7.Desimal Ke Biner");
        System.out.println("8.Desimal ke Oktal");
        System.out.println("9.Desimal ke Heksa");
        System.out.println("10.Heksa  ke Biner");
        System.out.println("11.Heksa  ke Oktal");
        System.out.println("12.Heksa  ke Desimal");

        System.out.println("\nMasukan no MENU: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Konversi Biner ke Oktal");
                System.out.println("Masukan Nilai Biner: ");
                long biner1 = input.nextLong();

                    int a, no = 0, nd = 0;
                    System.out.print("Nilai oktal dari biner " + biner1);
                    for (a = 1; biner1 != 0; biner1 = biner1 / 10, a = a * 2) {
                        nd = (int) (nd + (biner1 % 10) * a);
                    }
                    for (a = 1; nd != 0; a = a * 10) {
                        no = no + (nd % 8) * a;
                        nd = nd / 8;
                    }
                    System.out.println(" adalah " + no); break;

            case 2:
                System.out.println("Konversi Biner ke Desimal");
                System.out.println("Masukan Angka Biner: ");
                long biner2 = input.nextLong();
                long j = 1, d = 0;

                System.out.print("Nilai Desimal dari Biner " + biner2);
                while (biner2 != 0) {
                    long r = biner2 % 10;
                    d = d + r * j;
                    j = j * 2;
                    biner2 = biner2 / 10;
                }
                        System.out.println(" adalah " + d); break;

            case 3 :
                System.out.println("Konversi Biner ke Heksa");
                int hed = 0, m2 = 1, c = 1, em, ai = 0;
                char [] hn = new char[20];
                System.out.println("Masukan Nilai Biner: ");
                long bin = input.nextLong();

                System.out.print("\nNilai Heksa dari biner " + bin );
                while (bin != 0) {
                    em = (int) (bin % 10);
                    hed = hed + (em * m2);
                    if (c % 4 == 0) {
                        if (hed < 10)
                            hn[ai] = (char) (hed + 48);
                        else
                            hn[ai] = (char) (hed + 55);
                        m2 = 1;
                        c = 1;
                        hed = 0;
                        ai++;
                    }
                    else {
                        m2 = m2 * 2;
                        c++;
                    }
                    bin = bin / 10;
                }
                if(c != 1)
                    hn[ai] = (char)(hed + 48);
                if(c ==1)
                    ai--;
                System.out.print(" adalah ");
                for(ai = 1; ai >= 0; ai--)
                    System.out.print(hn[ai]); break;

            case 4:
                System.out.println("Konversi Oktal ke Bineri");
                System.out.println("Masukan Nilai Oktal: ");
                int ok = input.nextInt();
                int e = 0, dv = 0, bv = 0;

                if (ok == 8 & ok <= 9) {
                    System.out.println("Maaf angka yang anda masukan tidak valid"); break;
                }else
                    System.out.print("Nilai bineri dari oktal " + ok);
                while (ok != 0) {
                    dv += (ok % 10) * Math.pow(8, e);
                    ++e;
                    ok /= 10;
                }
                e = 1;
                while (dv != 0) {
                    bv += (dv % 2) * e;
                    dv /= 2;
                    e *= 10;
                }
                System.out.println(" adalah " + bv); break;

            case 5:
                System.out.println("Konversi Oktal ke Desimal");
                System.out.println("Masukan Nilai Oktal: ");
                int ok3 = input.nextInt();
                int nda = 0, t = 1, dig;

                System.out.print("Nilai Desimal dari oktal " + ok3);
                while (ok3 != 0) {
                    dig = ok3 % 10;
                    nda = nda + (dig * t);
                    t = t * 8;
                    ok3 = ok3 / 10;
                }
                System.out.println(" adalah " + nda); break;

            case 6:
                System.out.println("Konversi Oktal ke Heksa");
                int desim = 0, i2 = 0, re;
                char[] hexa = new char[20];
                System.out.println("Masukan Nilai Oktal: ");
                int okta = input.nextInt();

                System.out.print("Nilai heksa dari oktal " + okta);
                while (okta != 0) {
                    re = okta % 10;
                    desim = (int) (desim + (re * Math.pow(8, i2)));
                    i2++;
                    okta = okta / 10;
                }
                while (desim != 0) {
                    re = desim % 16;
                    if (re < 10)
                        re = re + 48;
                    else
                        re = re + 55;
                    hexa [i2] = (char) re;
                    i2++;
                    desim = desim / 16;
                }
                System.out.print(" adalah ");
                for(i2 = (i2 - 1); i2 >= 0; i2--)
                    System.out.print(hexa[i2]); break;

            case 7:
                System.out.println("Konversi Desimal ke Biner");
                System.out.println("Maukan nilai Desimal:  0");
                int des = input.nextInt();
                StringBuilder biner = new StringBuilder();
                for (int i = des; i > 0; i /= 2) {
                    biner.insert(0, (i % 2));
                }
                    System.out.println("Nilai biner dari Desimal " + des +
                            " adalah " + biner); break;

            case 8:
                System.out.println("Konversi Desimal ke Oktal");
                System.out.println("Masukan Angka desimal: ");
                int des2 = input.nextInt();
                String okt = "";
                for (int i = des2; i > 0; i /= 8) {
                    okt = (i % 8) + okt;
                }
                System.out.println("Nilai Oktal dari desimal " + des2 +
                        " adalah " + okt); break;

            case 9:
                System.out.println("Konversi Desimal ke Heksa");
                System.out.println("Masukan nilai desimal: ");
                int des1 = input.nextInt();

                StringBuilder hek = new StringBuilder();
                System.out.print("Nilai heksa dari desimal " + des1);
                while (des1 != 0) {
                    int v = des1 % 16;
                    char d1 = (v <= 9 && v >= 0) ?
                            (char) (v + '0') : (char) (v - 10 + 'A');
                    hek.insert(0, d1);
                    des1 = des1 / 16;
                }
                System.out.println(" adalah " + hek); break;

            case 10:
                System.out.println("Konversi Heksa ke Biner");
                System.out.println("Masukan Nilai Heksa: ");
                String  hex1 = input.next();

                if (hex1.length() != 1) {
                    System.out.println("Kamu harus memasukan tepat 1 karakter");
                    System.exit(1);
                }
                char ch = hex1.charAt(0);
                if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F')) {
                    System.out.print("Nilai Biner dari heksa " + hex1);
                    System.out.print(" adalah ");
                    switch (ch) {
                        case '0' -> System.out.print("0000");
                        case '1' -> System.out.print("0001");
                        case '2' -> System.out.print("0010");
                        case '3' -> System.out.print("0011");
                        case '4' -> System.out.print("0100");
                        case '5' -> System.out.print("0101");
                        case '6' -> System.out.print("0110");
                        case '7' -> System.out.print("0111");
                        case '8' -> System.out.print("1000");
                        case '9' -> System.out.print(1001);
                        case 'A' -> System.out.print(1010);
                        case 'B' -> System.out.print(1011);
                        case 'C' -> System.out.print(1100);
                        case 'D' -> System.out.print(1101);
                        case 'E' -> System.out.print(1110);
                        case 'F' -> System.out.print(1111);
                    }
                }
                else
                    System.out.println("Maaf angka yang anda masukan salah");break;
            case 11:
                System.out.println("Konversi Heksa ke Oktal");
                int dec = 0, r, u = 0;
                int[] oktal = new int[20];
                System.out.println("Masukan Nilai Heksa: ");
                String hex2 = input.next();

                int len = hex2.length();
                for(len=(len-1); len>=0; len--) {
                    r = hex2.charAt(len);
                    if(r >= '0' && r <= '9')
                        r = r - 48;
                    else if(r >= 'A' && r <= 'F')
                        r = r - 55;
                    else if(r >= 'a' && r <= 'f')
                        r = r - 87;
                    else {
                        System.out.println("\nnomor ini tidak valid!");
                        return;
                    }
                    int m = 1;
                    for(int k = 1; k <= u; k++)
                        m *= 16;
                    dec = (dec + (r * m));
                    u++;
                }
                for(u = 0; dec != 0; dec /= 8)
                    oktal[u++] = dec % 8;

                System.out.print("\nNilai Oktal dari heksa " + hex2 + " adalah ");
                for(u = (u - 1); u >= 0; u--)
                    System.out.print(oktal[u]); break;

            case 12:
                System.out.println("Konversi Heksa ke Desimal");
                System.out.println("Masukan No Heksa: ");
                String hex =  input.next();

                if (hex.length() != 1) {
                    System.out.println("Kamu harus memasukan tepat 1 karakter");
                    System.exit(1);
                }
                char ch1 = hex.charAt(0);
                if (ch1 <= 'F' && ch1 >= 'A') {
                    int v = ch1 - 'A' + 10;
                    System.out.println("Nilai desimal dari heksa " +
                            ch1 + " adalah " + v);
                }
                else if (Character.isDigit(ch1)) {
                    System.out.println("Nilai desimal dari heksa " +
                            ch1 + " adalah " + ch1);
                }
                else {
                    System.out.println(" Maaf nomor yang anda masukan salah");break;
                }
        }
    }
}