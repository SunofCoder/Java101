import java.util.Scanner;

public class Basamakbulma {
    public static void main(String[] args) {

        int number;
        int total = 0, temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayiyi Giriniz ..: ");
        number = scanner.nextInt();

        temp = number;

        while (temp!=0){

            total +=temp%10;
            temp /= 10;

        }
        System.out.println("sayinin basamaklari toplami "+ total);

    }
}
