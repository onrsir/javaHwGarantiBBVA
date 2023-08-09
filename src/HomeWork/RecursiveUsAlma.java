package HomeWork;
import java.util.Scanner;
public class RecursiveUsAlma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }

    public static boolean asalMi(int sayi, int bolen) {
        // Eğer sayı 2 veya daha küçük bir değerse, asal olma şartını sağlamaz.
        if (sayi <= 2) {
            return (sayi == 2);
        }

        // Eğer bolen, sayının yarısını aştıysa, artık bölen bulunamaz, asal kabul edilir.
        if (bolen > sayi / 2) {
            return true;
        }

        // Eğer sayı bölünebilirse, asal değildir.
        if (sayi % bolen == 0) {
            return false;
        }

        // Diğer durumlarda, rekürsif olarak bir sonraki böleni kontrol ederiz.
        return asalMi(sayi, bolen + 1);
    }
}
