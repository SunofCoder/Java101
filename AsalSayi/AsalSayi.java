public class AsalSayi {
    public static void main(String[] args) {

        int number ;
        for ( int i =2; i <= 100; i++){
            number =0;
            for (int j =2; j<i; j++)
            if (i%j == 0){
                number++;
            }
            if (number == 0){
                System.out.print(i+",");
            }
        }
    }
}
