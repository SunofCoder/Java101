import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number, fib1 =0, fib2 =1, temp = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("eleman sayisi giriniz :");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            //fib3 = fib1+ fib2; temp :0

            System.out.print(+fib1+"     +    "+fib2+"     = " +(fib1+fib2) +"\n");

              temp = fib2;
              fib2 += fib1;
              fib1 = temp;
        }
    }
}
