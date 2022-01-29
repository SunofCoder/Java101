import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        double pi = 3.14  ;
        int r , aci  ;
        double dilimAlanı;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaricapi Giriniz ");
        r = scanner.nextInt();

        System.out.println("açı ölçüsünü giriniz : ");
        aci = scanner.nextInt();

        double alan = pi* r *r;
        double cevre = 2* pi *r;
        dilimAlanı= alan*aci/360;


        System.out.println("alan " + alan);
        System.out.println("cevre " + cevre);
        System.out.println("Daire Dilimin Alani " + dilimAlanı);


    }



}
