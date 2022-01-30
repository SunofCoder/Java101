import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int yas;

        String burc = "";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz :");
        yas = scanner.nextInt();

        switch (yas%12){
            case 0:
                burc ="Maymun";
                break;
            case 1:
                burc ="Horoz";
                break;
            case 2:
                burc ="Kopek";
                break;
            case 3:
                burc ="Domuz";
                break;
            case 4:
                burc ="Fare";
                break;
            case 5:
                burc ="Okuz";
                break;
            case  6:
                burc ="Kaplan";
                break;
            case 7:
                burc="Tavsan";
                break;
            case 8:
                burc="ejderha";
                break;
            case 9:
                burc ="yilan";
                break;
            case 10:
                burc="at";
                break;
            case 11:
                burc ="koyun";
                break;
            default:
                System.out.println("hatali giris");

        }
        System.out.println("burcunuz :" +burc);
    }
}
