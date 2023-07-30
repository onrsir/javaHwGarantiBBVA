package HomeWork;
import java.util.Scanner;
public class asalSayi {
    public static void main(String[] args) {
        System.out.println("1-100 arasındaki asal sayılar:");

        for (int number = 2 ; number<=100; number++){
            boolean isPrime =true;
            for(int divisior=2;divisior<number;divisior++){
                if(number%divisior==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number+ " ");
            }
        }


    }

}
