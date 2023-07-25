package HomeWork;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class HipotenüsBulma {
    public static void main(String[] args) {

        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("A'nın uzunluğunu girin: ");
        a = input.nextInt();

        System.out.println("B'nın uzunluğunu girin: ");
        b = input.nextInt();


        c  = a*a + b*b;

        double d = sqrt(c);

        System.out.println("Hipotenüs uzunluğu: " + d);

       double u = (a + b + d) / 2;

       double alanınkaresi = u * (u-a) * (u-b) * (u-d);


       double alan = sqrt(alanınkaresi);

        System.out.println("Üçgenin alanı : " + alan);





    }
}
