package HomeWork;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        String id,password;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı girin: ");
        id = input.nextLine();
        System.out.println("Şifrenizi adınızı girin: ");
        password = input.nextLine();

        if(id.equals("onursir")  && password.equals("sırsırsır")){
            System.out.println("Giriş başarılı, anasayfaya yönlendiriliyorsunuz.");
        } else {
            System.out.println("Şifreniz veya id yanlış. Sıfırlamak istersen 1 yazman yeterli.");
            String check = input.nextLine();
            if(check.equals("1")) {
                System.out.println("Yeni şifreni gir..");
                String newpass = input.nextLine();

                if ( newpass.equals("sırsırsır")) {
                    System.out.println("Eski şifreniz ile aynı olamaz.");
                }
                else if (newpass.equals("sırsırsır")){

                    newpass = password;
                    System.out.println("Şifreniz başarılı ile oluşturuldu");
                }

            } else {
                System.out.println("Kendinize iyi bakın...");
            }

        }





    }
}
