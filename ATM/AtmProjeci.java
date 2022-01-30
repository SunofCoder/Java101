import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        String userName,password;
        int right = 3;
        int select;
        int balance=1500,price;

        Scanner scanner = new Scanner(System.in);

        while(right > 0) {
            System.out.println("Kullanici Adi");
            userName = scanner.nextLine();

            System.out.println("Parola");
            password = scanner.nextLine();

            if ((userName.equals("patika")) && (password.equals("patika123"))) {
                System.out.println("Bankasina Hosgeldiniz");
                do {
                    System.out.println("Hosgeldiniz.Yapmak istediginiz islemi seciniz .\n " +
                            "1- para yatirma \n" +
                            " 2- para cekme \n" +
                            " 3- bakiye sorma \n " +
                            "4- cikis  Yap");
                    select = scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = scanner.nextInt();
                            if(price >= 0){
                                balance += price;
                                System.out.println(price+" miktarda para yatırıldı!");
                            }else{
                                System.out.println("Yanlış Miktar Girişi...");
                            }
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = scanner.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz Bakiye...");
                            }else {
                                balance -= price;
                                System.out.println(price+" miktarda para çekildi!");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        default:
                            System.out.println("Yanlış Seçim Yaptınız...");
                    }



                    }while (select!=4);
                System.out.println("tekrar gorusmek uzere");
                    break;
            }else{
                right--;
                System.out.println("hatali kullanici adi veya sifre");
                if (right == 0){
                    System.out.println("hesabiniz bloke olmustur ...");
                }
                System.out.println("Kalan Hakkiniz "+right);
            }
        }
    }
}
