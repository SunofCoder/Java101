import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        int n,r ,fak1=1,fak2=1,fak3=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n sayisi");
        n = scanner.nextInt();
        System.out.println("r sayisi");
        r = scanner.nextInt();
        for(int i=1;i<=n;i++)
            fak1=fak1*i;
        for(int j=1;j<=(n-r);j++)
            fak2=fak2*j;
        for(int j=1;j<=r;j++)
            fak3=fak3*j;

        int result = (n / r * (n-r));
        System.out.println(result);




    }
}
