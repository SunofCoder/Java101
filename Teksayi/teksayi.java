import java.util.Scanner;

public class teksayi {
    public static void main(String[] args) {

        int sayi;
        int toplam = 0;


        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Sayi Giriniz ..");
            sayi = scanner.nextInt();
            if (sayi%4==0){
                toplam += sayi;
            }
        }
        while (sayi%2 ==0);
        System.out.println("toplam"+ toplam);

    }
}
