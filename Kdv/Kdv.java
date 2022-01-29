import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        double  ucret , kdv ;
        double oran = 0.18;


        Scanner scanner = new Scanner(System.in);
        System.out.print("ucret giriniz : ");
        ucret = scanner.nextFloat();

        if(ucret > 1000){
            oran = 0.08;
        }


        System.out.println("Kdvsiz Fiyati " + ucret );

        kdv   = (ucret * oran);
        System.out.println("Kdv fiyati" +  kdv );

        double kdvli = kdv+ucret;
        System.out.println("kvli fiyat " + kdvli);
        System.out.println("Kdv Orani " + oran );


    }

}
