import java.util.Scanner;

public class Kuvvet {
    public static void main(String[] args) {

        int number;
        int count  = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayiyi Giriniz :");
        number = scanner.nextInt();

        for (int i=1; i<=number; i*=4 ){
            System.out.println("4 katlari "+i);
        }

        System.out.println("****************************");
        count = 0;


        for (int a=1; a<=number; a*=5 ){
            System.out.println(" 5 katlari "+ a);
        }






    }
}
