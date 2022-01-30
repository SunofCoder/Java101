import java.util.Scanner;

public class uslu {
    public static void main(String[] args) {
        int n,k;
        int total =1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ussu sayisi");
        n = scanner.nextInt();
        System.out.println("us sayisi");
        k= scanner.nextInt();

        for(int i = 0; i <k ; i++){
            total *= n;

        }
        System.out.println("cevap:"+total);
    }
}
