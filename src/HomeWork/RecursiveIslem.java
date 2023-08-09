package HomeWork;
import java.util.Scanner;

public class RecursiveIslem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        recursiveIslem(n);
    }

    public static void recursiveIslem(int n) {
        System.out.println("Şu anki değer: " + n);

        if (n <= 0) {
            // Sayı 0 veya negatif olduğunda tekrar 5 ekleyerek işlemi tamamla.
            recursiveIslem(n + 5);
        } else {
            // Sayıdan 5 çıkar.
            recursiveIslem(n - 5);
        }
    }
}
