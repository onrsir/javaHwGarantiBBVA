package HomeWork;
import java.util.Scanner;
public class KdvHesaplama {

    public static void main(String[] args) {
        double anapara;
        double kdvlitutar = 1.18;
        Scanner input = new Scanner(System.in);

        System.out.println("Paranızı girin: ");

        anapara = input.nextInt();


        double toplamtutar = (anapara * kdvlitutar);
        double kdv = toplamtutar - anapara;

        System.out.println("KDV'siz: " + anapara);
        System.out.println("KDV tutarı: "+ kdv);
        System.out.println("KDV dahil: " + toplamtutar);

        double hesap = anapara > 0 && anapara < 1000 ? (anapara*kdvlitutar) : (anapara*1.08);

        System.out.println(hesap);


    }
}
