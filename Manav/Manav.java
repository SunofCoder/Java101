import java.util.Scanner;

public aclass Manav {
    public static void main(String[] args) {

        double armutfiyati =2.14 , elmafiyati = 3.67 , domatesfiyati = 1.11 , muzfiyati = 0.95 ,patlicanfiyati =5.00 , tutar;
        int armut , elma , domates , muz , patlican ;



        Scanner scanner = new Scanner(System.in);
        System.out.println("armut kac kilo  :");
        armut = scanner.nextInt();

        System.out.println("elma kac kilo :");
        elma = scanner.nextInt();

        System.out.println("domates kac kilo :");
        domates = scanner.nextInt();

        System.out.println("muz kac kilo :");
        muz = scanner.nextInt();

        System.out.println("patlican kac kilo :");
        patlican = scanner.nextInt();

        tutar = (armut*armutfiyati) + (elma*elmafiyati) + (domates*domatesfiyati) + (muz*muzfiyati) + (patlican*patlicanfiyati);
        System.out.println("Toplam Tutar :" + tutar);


    }
}
