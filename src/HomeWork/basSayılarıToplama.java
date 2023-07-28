package HomeWork;
import java.util.Scanner;
public class basSayılarıToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi gir :");
        int sayi = input.nextInt();

        int toplam =0;
        int kalan;

        while(sayi >0){
            kalan = sayi % 10; // son basamak alınır
            toplam +=kalan; // son basamağı toplam değişkenine ekliyoruz.
            sayi /=10; // sayıyı en sağdaki basamağından arındırıyoruz.
        }
        System.out.println(toplam);


    }
}
