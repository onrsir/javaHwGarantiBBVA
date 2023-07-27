package HomeWork;
import java.util.Scanner;
public class HesapMakinesi {

    public static void main(String[] args) {
        double a,b;
        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayınızı giriniz: ");
        a = input.nextInt();

        System.out.println("İkinci sayınızı giriniz: ");
        b = input.nextInt();

        System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme ");

        int selected;
        selected = input.nextInt();

        switch (selected) {

            case 1:
                System.out.println("Toplam: " + a+b);
                break;
            case 2:
                System.out.println("Çıkarma: " + (a - b));
                break;
            case 3:
                System.out.println("Çarpma: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Payda 0 olursa ise tanımsız bir sayı elde edeceksiniz. ");
                } else {
                    System.out.println("Bölme: " + (a / b));
                    break;
                }


            default:
                System.out.println("Lütfen 1-4 arasında bir sayı giriniz.");
        }








    }




}
