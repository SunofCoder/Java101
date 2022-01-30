import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int  number = scanner.nextInt();
        double result = 0.0;

        for (double i= 1; i<=number ; i++){
            result +=(1.0/i);
        }
        System.out.println(result);

    }
}
