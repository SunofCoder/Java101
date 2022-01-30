import java.util.Scanner;


public class UcakBileti {
    public static void main(String[] args) {
        int  km , yas ,mesafe ,select ;
        double Mesafe_ucret = 0.10;
        double yas_indirim;
        double indirimli_tutar ;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi Km cinsinden Giriniz:");
        km = scanner.nextInt();

        System.out.println("Yasinizi Giriniz :");
        yas = scanner.nextInt();

        System.out.println("Yolculuk Tipini Giriniz (1- Tek yon ,2-Gidis Donus");
        select = scanner.nextInt();

        double normal_tutar = Mesafe_ucret * km;


        if(yas <= 12){
              yas_indirim = normal_tutar * 0.50;
              indirimli_tutar = normal_tutar - yas_indirim;
        }
        else if(yas >=12 && yas <=24){
                 yas_indirim = normal_tutar * 0.10;
                indirimli_tutar = normal_tutar - yas_indirim;
        }
        else if(yas>=65){
                yas_indirim = normal_tutar * 0.30;
                indirimli_tutar = normal_tutar - yas_indirim;
        }
        else {
            indirimli_tutar = normal_tutar;

        }
        if (select == 1){
            System.out.println("toplam tutar :" +normal_tutar);
        }else if (select ==2) {
            double gidis_donus_bilet_indirimi = indirimli_tutar * 0.20;
            double toplam_tutar = (indirimli_tutar - gidis_donus_bilet_indirimi) * 2;
            System.out.println("Toplam Tutar :" + toplam_tutar);
        }else {
            System.out.println("Hatali Giris ");
        }



    }


}
