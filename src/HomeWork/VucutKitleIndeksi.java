package HomeWork;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy ,kg;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu girin(m): ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu girin(kg): ");
        kg = input.nextDouble();

        double kütleIndeks = kg / (boy * boy);

        System.out.println("Vücut kütle indeksiniz : " + kütleIndeks);




    }
}
