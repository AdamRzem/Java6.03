import java.sql.SQLOutput;
import java.util.Scanner;

public class podatek {
    public static void main(String[] args) {
        Scanner klawiwatura = new Scanner(System.in);
        System.out.println("Podaj cenę: ");
        double cena, podatek, napiwek, ostatecznaCena;
        cena = klawiwatura.nextDouble();
        podatek = cena * 0.0675;
        napiwek = cena * 0.2;
        ostatecznaCena = cena + podatek + napiwek;
        System.out.println(cena);
        System.out.println(podatek);
        System.out.println(napiwek);
        System.out.println(ostatecznaCena);
    }
}



