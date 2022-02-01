import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int number, total = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        number = scanner.nextInt();

        for (int i =1; i < number; i++){
            if (number%i == 0){
                total += i;
            }
        }

        if(total == number)
            System.out.println("Mukemmel Sayidir.");
        else
            System.out.println("Mukemmel Sayi Degildir .");

    }
}
