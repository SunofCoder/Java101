import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat , fizik ,kimya , muzik, turkce ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunuz :");
        mat = scanner.nextInt();
        int matnot = (mat <= 100 && mat >= 0) ? mat: 0;


        System.out.println("Fizik Notunuz :");
        fizik = scanner.nextInt();
        int fiziknot = (fizik <= 100 && fizik >= 0) ? fizik : 0;


        System.out.println("Kimya Notunuz : ");
        kimya = scanner.nextInt();
        int kimyanot = (kimya <= 100 && kimya >= 0) ? kimya : 0;


        System.out.println("Muzik Notunuz :");
        muzik = scanner.nextInt();
        int muziknot = (muzik <= 100 && muzik >= 0) ? muzik : 0;

        System.out.println("Turkce Notunuz :");
        turkce = scanner.nextInt();
        int turkcenot = (turkce <= 100 && turkce >= 0) ? turkce : 0;



        double ort = (matnot + turkcenot + fiziknot + kimyanot + muziknot );
        ort = ort /5;

        if (ort >= 55){
            System.out.println("gectiniz .");
        }else{
            System.out.println("Kaldiniz .");
        }

        System.out.println("Ortalama" +ort );
    }
}

