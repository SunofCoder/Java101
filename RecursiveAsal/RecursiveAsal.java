import java.util.Scanner;

public class RecursiveAsal {

    static  int prime(int n, int div){
        if (n%div==0){
            if (n==2){
                return 1;
            }
            return 0;
        }else if (div==2){
            return 1;
        }else
            return prime(n,div-1);
    }

    public static void main(String[] args) {
         int number , result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi Giriniz :");
        number = scanner.nextInt();

        result = prime(number ,number-1);
        if(result == 0){
            System.out.println(prime +" Asaldir");
        }else{
            System.out.println(prime +"Asal degildir");
        }


    }
}
