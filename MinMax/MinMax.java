import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {

        int n, max = 0, min = 99999, number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç tane sayı girilecek :");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz :");
            number = sc.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
