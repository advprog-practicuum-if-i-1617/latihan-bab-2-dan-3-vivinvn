package praktikumm;

public class konversi {
    public konversi(){
        
    }
    private String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    private int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    private String hasil;
    private int hasilAngka;

    public String Konversi(int angka) {
        if (angka > 0 && angka < 12) {
            hasil = huruf[angka];
        } else if (angka >= 12 && angka <20) {
            hasil = huruf[angka - 10] + " Belas";
        } else if (angka >= 20 && angka < 100) {
            hasil = huruf[angka / 10] + " Puluh " + huruf[angka % 10];
        } else if (angka == 100) {
            hasil = "Seratus";
        } else if (angka >= 100 && angka <= 199) {
            hasil = "Seratus " + Konversi(angka % 100);
        } else if (angka >= 200 && angka < 999) {
            hasil = Konversi(angka / 100) + " Ratus " + Konversi(angka % 100);
        } else if (angka == 1000) {
            hasil = "Seribu";
        } else if (angka > 1000 && angka < 0) {
            System.out.println("Angka Tidak Ditemukan");
        }
        return hasil;
    }

    public int Konversi(String huruf) {
        for (int i = 0; i < this.huruf.length; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (huruf.equalsIgnoreCase(this.huruf[i])) {
                        hasilAngka = angka[i];
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " belas")) {
                        hasilAngka = angka[i] + 10;
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh")) {
                        hasilAngka = angka[i] * 10;
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " puluh " + this.huruf[j])) {
                        hasilAngka = angka[i] * 10 + angka[j];
                    } else if (huruf.equalsIgnoreCase("Seratus")) {
                        hasilAngka = 100;
                    } else if (huruf.equalsIgnoreCase("Seratus " + this.huruf[j])) {
                        hasilAngka = 100 + angka[j];
                    } else if (huruf.equalsIgnoreCase("Seratus " + this.huruf[j] + " Belas")) {
                        hasilAngka = 110 + angka[j];
                    } else if (huruf.equalsIgnoreCase("Seratus " + this.huruf[j] + " Puluh")) {
                        hasilAngka = 100 + angka[j] * 10;
                    } else if (huruf.equalsIgnoreCase("Seratus " + this.huruf[j] + " Puluh " + this.huruf[k])) {
                        hasilAngka = 100 + angka[j] * 10 + angka[k];
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " Ratus")) {
                        hasilAngka = angka[i] * 100;
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " Ratus " + this.huruf[j])) {
                        hasilAngka = angka[i] * 100 + angka[j];
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " Ratus " + this.huruf[j] + " Belas")) {
                        hasilAngka = angka[i] * 100 + 10 + angka[j];
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " Ratus " + this.huruf[j] + " Puluh")) {
                        hasilAngka = angka[i] * 100 + 10 * angka[j];
                    } else if (huruf.equalsIgnoreCase(this.huruf[i] + " Ratus " + this.huruf[j] + " Puluh " + this.huruf[k])) {
                        hasilAngka = angka[i] * 100 + 10 * angka[j] + angka[k];
                    } else if (huruf.equalsIgnoreCase("Seribu")) {
                        hasilAngka = 1000;
                    }
                }
            }
        }
        return hasilAngka;
    }
}
