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
    }
}