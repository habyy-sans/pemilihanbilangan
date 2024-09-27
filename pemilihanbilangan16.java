import java.util.Scanner;
public class pemilihanbilangan16 {
    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan sebuah angka: ");
    int angka = sc.nextInt();
        String result = (angka % 2 == 0) ? "bialngan genap" : "bilangan ganjil";
            System.out.println("Angka " + angka +" termasuk " + result);
        }
        
    }