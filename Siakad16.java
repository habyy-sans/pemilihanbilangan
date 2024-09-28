import java.util.Scanner;

public class Siakad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String NIM = scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan nomor absen: ");
        int absen = scanner.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = scanner.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = scanner.nextDouble();

        double nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

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
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + NIM + ") kelas " + kelas + " nomor absen " + absen);
        System.out.printf("Nilai akhir: %.2f\n", nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        
      
    }
}