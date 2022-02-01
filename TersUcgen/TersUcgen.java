import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Basamak sayi giriniz :");
        number = scanner.nextInt();

        for (int i= 1; i<=number; i++){
            // space
            for (int  j=1; j <= i-1; j++){
                System.out.println("*");
            }
            // star
            for (int k=1; k <= 2*(number-i)+1;  k++){
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
