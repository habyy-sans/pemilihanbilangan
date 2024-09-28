import java.util.Scanner;
public class kafe16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        System.out.print("Masukan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukan keanggotaan: ");
        keanggotaan = sc.nextBoolean();
        
        double hargaMenu = 0;
        switch (menu.toLowerCase()){
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                System.out.println("ukuran Small dipilih");
                break;
            case 'M':
                System.out.println("ukuran medium dipilih");
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                System.out.println("ukuran large dipilih");
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("ukuran tidak tersedia. Pilih S, M, atau L.");
                break;
        }
        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);
    }
}