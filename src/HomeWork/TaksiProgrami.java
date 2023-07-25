package HomeWork;
import java.util.Scanner;
public class TaksiProgrami {
    public static void main(String[] args) {

        double kmUcret = 2.20;
        int minTutar= 20;
        int acilisUcret=10;
        int gidilenMesafe ;
        double totalTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Gidilen Mesafeyi Girin : ");

        gidilenMesafe = input.nextInt();

        totalTutar = (gidilenMesafe * kmUcret) + acilisUcret;

        double TaksiMetreMin = totalTutar < minTutar ? minTutar : totalTutar;

        System.out.println("Toplam tutar: " + TaksiMetreMin);



    }
}
