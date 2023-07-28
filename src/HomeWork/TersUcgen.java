package HomeWork;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        System.out.println("Kaç basamaklı üçgen olsun: ");
        Scanner input = new Scanner(System.in);
        int basamakSayisi= input.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            // Boşlukları yazdırma
            for (int k = 1; k <= basamakSayisi - i; k++) {
                System.out.print("  ");
            }

            // Yıldızları yazdırma
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Bir satırı tamamladık, alt satıra geç.
        }

    }
}
