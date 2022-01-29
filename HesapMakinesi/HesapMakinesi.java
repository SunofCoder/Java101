import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int x ,y,select;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayi'yi Giriniz :");
        x = scanner.nextInt();
        System.out.println("Ikinci Sayi'yi Giriniz :");
        y = scanner.nextInt();

        System.out.println(" 1- toplama \n 2- cikarma \n 3-carpma \n 4-bolme");
        System.out.print("Islem seciniz :");
        select = scanner.nextInt();

        switch (select){
            case  1:
                System.out.println("toplama :" + (x+y));
                break;
            case 2:
                System.out.println("cikarma :" +(x-y));
                break;
            case 3:
                System.out.println("carpma:" +(x*y));
                break;
            case 4:
                if (y!=0) {}
                System.out.println("bolme :" +(x%y));
                break;
            default:
                System.out.println("Lutfen islem seciniz .");


        }


    }
}


