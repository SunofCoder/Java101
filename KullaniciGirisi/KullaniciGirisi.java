import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String username ,password ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanici Adi :");
        username = scanner.nextLine();
        System.out.println("Sifreniiz Giriniz :");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("patika123") ){
            System.out.println("Giris Yapildi");
        }
        else if (username.equals("patika")&&!password.equals("patika123")){
            System.out.println("Giris Basarisiz .Sifirlamak istermisiniz ?  ");
            System.out.printf("islem Seciniz  y - yes  n- no ");
            String select = scanner.nextLine();
             if (select.equals("y")){
                System.out.println("Yeni Sifre Giriniz..");
                String newPassword =scanner.nextLine();
                if (newPassword.equals("patika123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Sifre olusturuldu...");
                }
            }

        else{
                System.out.println("Giriş yapılamadı.");

            }
        scanner.close();


        }


    }
}
