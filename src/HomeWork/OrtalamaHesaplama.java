package HomeWork;

import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        int mat , kimya, türkçe, tarih ,müzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Mat notunu gir: ");
        mat = input.nextInt();

        System.out.println("Kimya notunu gir: ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunu gir: ");
        türkçe = input.nextInt();


        System.out.println("Tarih notunu gir: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunu gir: ");
        müzik = input.nextInt();


        double ortalama = (mat + kimya + türkçe + tarih + müzik)/6;

        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = ortalama > 60 ? "geçti" : "kaldı";

        System.out.println(sonuc);
    }
}
