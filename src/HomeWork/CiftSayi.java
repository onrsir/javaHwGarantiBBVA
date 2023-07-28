package HomeWork;
import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int toplam = 0;
        int iterasyonadet =0;
        int k = input.nextInt();

        for (int i = 1; i<=k;i++){

            if(i % 3 == 0 && i % 4 == 0) {
                toplam+= i;
                iterasyonadet++;
            }

            }

                int sonuc = toplam / iterasyonadet;
                System.out.println(sonuc);


        }


    }

