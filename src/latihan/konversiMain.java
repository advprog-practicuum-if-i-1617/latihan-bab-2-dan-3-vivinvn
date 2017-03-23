package praktikumm;

import java.util.Scanner;

public class konversiMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        konversi k = new konversi();
        String a;
        int pilihan;
        boolean choose = true;
        do {
            System.out.println("===================Konversi===================");
            System.out.println("1. Konversi Angka ke Huruf");
            System.out.println("2. Konversi Huruf ke Angka");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda\t :");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Angka\t :");
                    int angka = in.nextInt();
                    System.out.println("Hasil Konversi\t : " + k.Konversi(angka));
                    break;
                case 2:
                    System.out.print("Masukkan Huruf\t :");
                    String huruf = in.nextLine();
                    huruf = in.nextLine();
                    System.out.println("Hasil Konversi\t : " + k.Konversi(huruf));
                    break;
                case 3:
                    choose = false;
                    break;
            }
        } while (choose == true);
    }
}
