package HomeWork;
import java.util.Scanner;
public class EnBuyukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kacSayi;
        System.out.println("Kaç sayı giriliecek");
        kacSayi = input.nextInt();

        System.out.println("1.Sayıyı giriniz: ");
        int number = input.nextInt();

        int max = number;
        int min = number;

        for (int i = 1; i < kacSayi; i++) {

            System.out.println((i+1) + ".Sayıyı giriniz: ");
            number = input.nextInt();

            if (number>max){
                max = number;
            }
            if (number <min){
                min = number;
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("En küçük sayı: "+ min);

    }
}
