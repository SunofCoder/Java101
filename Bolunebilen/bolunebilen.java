import java.util.Scanner;

public class bolunebilen {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;
        int bolen =0;
        double ort;



        Scanner scanner = new Scanner(System.in);
        sayi = scanner.nextInt();


        for (int i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                bolen++;
            }
        }
         ort = toplam/bolen;
        System.out.println("ortalama: "+ort);



            }}

