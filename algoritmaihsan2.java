import java.util.Scanner;

public class HitungLembarDanKepingUang {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nominal: ");
            int nominal = input.nextInt();

            int[] pecahan = {100000,50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
            int[] jumlah = new int[pecahan.length];

            for (int i = 0; i < pecahan.length; i++) {
                if (nominal >= pecahan[i]) {
                    jumlah[i] = nominal / pecahan[i];
                    nominal %= pecahan[i];
                }
            }

            if (nominal > 0) {
                System.out.println("Terdapat kelebihan uang sebesar " + nominal + " rupiah.");
            }

            for (int i = 0; i < pecahan.length; i++) {
                if (jumlah[i] > 0) {
                    if (pecahan[i] >= 1000) {
                        System.out.println(jumlah[i] + " lembar " + pecahan[i] + " ribuan");
                    } else {
                        System.out.println(jumlah[i] + " keping " + pecahan[i]);
                    }
                }
            }
        }
    }
}