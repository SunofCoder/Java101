import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {

        double perKm = 2.20;
        double acilis_ucreti = 10.00;
        double  tutar ,ucret ,mesafe ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi Giriniz :  ");
        mesafe = scanner.nextInt();

        tutar = acilis_ucreti +(mesafe * perKm);

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Toplam Tutar : "+ tutar);


    }

}
