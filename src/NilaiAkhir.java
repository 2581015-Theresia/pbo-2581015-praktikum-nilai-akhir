import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Konstanta bobot penilaian
        final double BOBOT_PRAKTIKUM = 0.3;
        final double BOBOT_TUGAS = 0.2;
        final double BOBOT_MID = 0.2;
        final double BOBOT_FINAL = 0.3;

// Input Nilai
        System.out.print("Nilai praktikum :");
        double praktikum = scanner.nextDouble();

        System.out.print("Nilai tugas     :");
        double NilaiTugas = scanner.nextDouble();

        System.out.print("Nilai MID      :");
        double NilaiMID = scanner.nextDouble();

        System.out.print("Nilai final     :");
        double NilaiFinal = scanner.nextDouble();

        /*
         * Percobaan menggunakan int:
         * praktikum * 30 / 100 + tugas * 20 / 100
         * + mid * 20 / 100 + finalNilai * 30 / 100
         *
         * Hasilnya menjadi 78, bukan 79.1, karena pembagian integer
         * tidak mengeluarkan bentuk pecahan.
         */

        /*
         * Menggunakan operator Precedence tidak membutuhkan kurung karena operator * dikerjakan
         * lebih dahulu daripada operator +.
         */


    }

}