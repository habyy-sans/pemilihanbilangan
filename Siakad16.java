import java.util.Scanner;
public class Siakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = sc.nextDouble();

        double nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.3) + (nilaiUjian * 0.5);
        System.out.printf("Nilai akhir: %.2f\n", nilaiAkhir);
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}