package HomeWork;
import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyel: ");
        int k = input.nextInt();
        int toplam = 1;

        for (int i = 1; i<=k; i++) {
             toplam *= i;

        }
        System.out.println(toplam);
    }
}
