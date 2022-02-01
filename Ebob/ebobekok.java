import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {


        int n1 ,n2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Sayı :");
        n1 = scanner.nextInt();
        System.out.print("2.Sayı :");
        n2 = scanner.nextInt();

        int ebob=1;
        int ekok=1;
        int x =n1;

        for (int k=n1;k>=1;k--){
            if (n1%k==0 && n2%k==0){
                ebob=k;
                break;
            }
        }

        for (int i =1 ; i <= (n1*n2); i++){
            if (i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }

        System.out.println((n1*n2)/ebob);
        System.out.println("While dongusu kullanilarak");

        while (x > 1){
            if (n1 % x ==0 && n2 % x ==0){
                ebob= x;
                ekok= (n1 * n2) / ebob;
                break;
            }
            x--;

        }
        System.out.println("Ebob : " +ebob);
        System.out.println("Ekok : " +ekok);
    }

}




