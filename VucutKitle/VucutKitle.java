import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        int  kilo;
        double boy;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz .: ");
        boy = scanner.nextDouble();
        System.out.println("Kilonuzu Giriniz : ");
        kilo =scanner.nextInt();

        double kitle_index = kilo / (boy * boy);
        System.out.println("Kitle Indeki : "+kitle_index);
    }
}
