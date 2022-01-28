import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat, fizik , kimya, turkce, tarih , muzik ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("matematik kodu: ");
        mat = scanner.nextInt();

        System.out.println("fizik notu : ");
        fizik = scanner.nextInt();

        System.out.println("kimya  notu : ");
        kimya = scanner.nextInt();

        System.out.println("turkce nodu: ");
        turkce = scanner.nextInt();

        System.out.println(" tarih notu : ");
        tarih = scanner.nextInt();

        System.out.println("muzik notu: ");
        muzik =  scanner.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);

        double sonuc = toplam / 6.0;

        System.out.println( "ortalama " + sonuc);

        String str    =  (sonuc >= 60) ? "Sinifi Gecti " : " Sinifta Kaldi ";

        System.out.println(str);










    }

}

