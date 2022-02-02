import java.util.Scanner;

public class UsAlmaRecursive {
    static  int pow(int a , int b){

        if (b==0){
            return 1;
        }else if (b==1){
            return a;
        } else
            return  a*pow(a,(b-1));

    }

    public static void main(String[] args) {
        int base,exp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban Degeri Giriniz");
        base = scanner.nextInt();
        System.out.println("Us Degerini Giriniz");
        exp = scanner.nextInt();
        System.out.println("Sonuc"+pow(base,exp));
    }
}
