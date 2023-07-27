package HomeWork;
import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        double mesafe,ucretlendirme=0.10;
        int yas = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen gideceğiniz mesafeyi yazınız: ");
        mesafe = input.nextDouble();
        if(mesafe>0) {
            System.out.println("Yaşınızı girin: ");
            yas = input.nextInt();
            if(yas<0){
                System.out.println("yaşınız 0'dan küçük olamaz: ");
                System.out.println("Lütfen yaşınızı tekrar girin: ");
                yas = input.nextInt();
            }

        } else if(mesafe<0){
            System.out.println("Mesafe 0'dan küçük olamaz: ");
            System.out.println("Lütfen mesafenizi tekrar girin: ");
            mesafe = input.nextInt();
            System.out.println("Lütfen Yaşınızı girin: ");
            yas = input.nextInt();
            if(yas<0){
                System.out.println("yaşınız 0'dan küçük olamaz: ");
                System.out.println("Lütfen yaşınızı tekrar girin: ");
                yas = input.nextInt();
            }
        }

        input.nextLine();

        System.out.println("Yolculuk tipini girin:1 =>Tek yön, 2 =>Gidiş Dönüş ");
        String yolculukTipi = input.nextLine();

        double normalTutar = mesafe * ucretlendirme;

        if (yas < 12) {
            double indirim50 = normalTutar * 0.50;
            double total = normalTutar - indirim50;

            if(yolculukTipi.equals("1")){
                System.out.println("Toplam Tutar : " + total);

            } else if(yolculukTipi.equals("2")){
                double çiftYön= indirim50 * 0.20;
                 total = (indirim50 - çiftYön) * 2;
                System.out.println("Toplam Tutar : " + total);
            }

            } else if (yas>=12 && yas<24){
            double indirim10 = normalTutar * 0.10;
            double total = normalTutar - indirim10;
            if(yolculukTipi.equals("1")){
                System.out.println("Toplam Tutar : " + total);

            } else if(yolculukTipi.equals("2")){
                double çiftYön= indirim10 * 0.20;
                 total = (indirim10 - çiftYön) * 2;
                System.out.println("Toplam Tutar : " + total);
            }

        } else if (yas>65){
            double indirim30 = normalTutar * 0.30;
            double total = normalTutar - indirim30;

            if(yolculukTipi.equals("1")){
                System.out.println("Toplam Tutar : " + total);

            } else if(yolculukTipi.equals("2")){
                double çiftYön= indirim30 * 0.20;
                 total = (indirim30 - çiftYön) * 2;
                System.out.println("Toplam Tutar : " + total);
            }
        }

    }
}
