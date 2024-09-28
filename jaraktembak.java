import java.util.Scanner;

public class jaraktembak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan shooting range: ");
        int range = scanner.nextInt(); 

        if (range <= 5) {
            System.out.println("uses malee weapons.");
        } else if (range >=5) {
            System.out.println("uses ranged weapons.");
        } else {
            System.out.println("cari senjata yang lain :) ");
        }
    }
}
