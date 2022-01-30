
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yil Giriniz");
        yil = scanner.nextInt();

        if ((yil %400 ==0) && (yil%4 == 0)){
            System.out.println(yil +" bir artik yil degildir");
        }
        else {
            System.out.println(yil+"bir artik yildir");
        }
    }
}
