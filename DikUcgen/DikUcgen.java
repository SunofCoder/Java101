package DikUcgen;
import java.util.Scanner;

public class DikUcgen {
    
    int a, b, c, u;
         

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kenarı giriniz : ");
        a= scanner.nextInt();

        System.out.println("2. kenarı giriniz : ");
        b= scanner.nextInt();

        System.out.println("3. kenarı giriniz : ");
        c= scanner.nextInt();

        u = (a+b+c)/2 ;
        int cevre = u*2;



        double alan= Math.sqrt((u*((u-a)*((u-b)*((u-c)); 
        
        System.out.println("Üçgenin Alanı : "+ alan);


}
