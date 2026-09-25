import java.util.Scanner;
import java.util.Locale;

public class NilaiAkhir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

// Konstanta bobot penilaian
        final double BOBOT_PRAKTIKUM = 0.30;
        final double BOBOT_TUGAS = 0.20;
        final double BOBOT_MID = 0.20;
        final double BOBOT_FINAL = 0.30;

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

double akhir = praktikum * BOBOT_PRAKTIKUM
        + NilaiTugas * BOBOT_TUGAS
        + NilaiMID * BOBOT_MID;

//Augmented assignment untuk nilai final
        akhir += NilaiFinal * BOBOT_FINAL;

//Casting double ke int agar membuang bagian pecahan
int dibulatkan = (int) akhir;

//Menghitung selisih
double selisih = (int) akhir;

//Status Kelulusan
boolean lulus = akhir >= 60;

//Menampilkan hasil
System.out.println();
System.out.println("========== NILAI AKHIR ===========");
System.out.println("Praktikum :" + praktikum + "(30%)");
System.out.println("Tugas     :" + NilaiTugas + "(20%)");
System.out.println("MID       :" + NilaiMID + "(20%)");
System.out.println("Final     :" + NilaiFinal + "(30%)");
System.out.println();
System.out.println("Nilai akhir :" + akhir);
System.out.println("Dibulatkan  :" + dibulatkan);
System.out.println("Selisih     :" + selisih);
System.out.println("Lulus (>=60 :" + lulus );

scanner.close();
    }

}