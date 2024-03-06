import java.sql.SQLOutput;
import java.util.Scanner;

public class przepis {
    public static void main(String[] args) {
        Scanner klawiwatura = new Scanner(System.in);
        double szklankiCukru = 1.5;
        double szklankiMasla = 1;
        double szklankiMaki = 2.75;
        int lCiastek = 48;
        double CukruNaCiastko = szklankiCukru/lCiastek;
        double MaslaNaCiastko = szklankiMasla/lCiastek;
        double MakiNaCiastko = szklankiMaki/lCiastek;

        int oczekiwanaLCiastek = klawiwatura.nextInt();
        double potrzebnaMaka = MakiNaCiastko * oczekiwanaLCiastek;
        double potrzebneMaslo = MaslaNaCiastko * oczekiwanaLCiastek;
        double potrzebnyCukier = CukruNaCiastko * oczekiwanaLCiastek;

        System.out.println(potrzebnaMaka);
        System.out.println(potrzebneMaslo);
        System.out.println(potrzebnyCukier);
    }
}


