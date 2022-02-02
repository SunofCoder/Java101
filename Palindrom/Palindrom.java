import java.util.Scanner;

public class Palindrom {

    static  boolean isPalindrom(int numb){
        int temp = numb, reverseNumb=0, lastNumb;
        while (temp != 0){
            lastNumb = temp % 10;
            reverseNumb = (reverseNumb*10) + lastNumb;
            temp /= 10;
        }

        return (numb == reverseNumb) ? true : false;

    }


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        if(isPalindrom(number))
            System.out.println("palindrom sayidir");
        else
            System.out.println("Palindrom Degildir");//? Palindrom sayidir; : Palindom degildir.;
    }
}
