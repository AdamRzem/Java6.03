import java.sql.SQLOutput;
import java.util.Scanner;

public class winnica {
    public static void main(String[] args) {
        Scanner klawiwatura = new Scanner(System.in);
        double dl, okratowanie, odlMiedzy;
        dl = klawiwatura.nextDouble();
        okratowanie = klawiwatura.nextDouble();
        odlMiedzy = klawiwatura.nextDouble();
        int wynik = Math.toIntExact(Math.round((dl - 2*okratowanie)/odlMiedzy));
        System.out.println(wynik);
    }
}