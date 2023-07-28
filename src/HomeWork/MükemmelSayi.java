package HomeWork;
import java.util.Scanner;
public class MükemmelSayi {
    public static void main(String[] args) {


        System.out.println("Sayiyi giriniz.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int toplam = 0;
        for (int i=1; i<number; i++ ){
            if(number%i ==0){
                toplam = toplam + i;
            }

        }
        while(!(number==toplam)){
            if (toplam==number){
                System.out.println(toplam);
                System.out.println("Mükemmel sayıyı buldunuz...!");
            } else{
                System.out.println("Tekrar dene");
                 number = input.nextInt();
                 toplam = 0;
                for (int i=1; i<number; i++ ){
                    if(number%i ==0){
                        toplam = toplam + i;
                    }

                }

            }

        }
        System.out.println("Mükemmel sayıyı buldunuz...!");



    }
}
