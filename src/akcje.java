import java.sql.SQLOutput;
import java.util.Scanner;

public class akcje {
    public static void main(String[] args) {
        Scanner klawiwatura = new Scanner(System.in);
        int lAkcji = 600;
        double cenaAkcji = 21.77;
        double prowizja = 0.02;
        double cenaAkcjiBezProwizji = cenaAkcji * lAkcji;
        double cenaAkcjiZProwizja = cenaAkcjiBezProwizji + cenaAkcjiBezProwizji * prowizja;
        System.out.println(cenaAkcjiBezProwizji);
        System.out.println(prowizja);
        System.out.println(cenaAkcjiZProwizja);
    }
}


