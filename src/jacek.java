import java.sql.SQLOutput;
import java.util.Scanner;

public class jacek {
    public static void main(String[] args) {
        Scanner klawiwatura = new Scanner(System.in);
        int lKupionychAkcji = 1000;
        double cenaKupna = 32.87;
        double prowizja = 0.02;
        double cenaSprzedazy = 33.92;
        double prowizjaZaplacona =((lKupionychAkcji * cenaKupna) * prowizja) + ((lKupionychAkcji * cenaSprzedazy) * prowizja);
        double cenaOgKupna = lKupionychAkcji * cenaKupna + (lKupionychAkcji * cenaKupna) * prowizja;
        double cenaOgSprzedazy = lKupionychAkcji * cenaSprzedazy - (lKupionychAkcji * cenaSprzedazy) * prowizja;
        double zysk = cenaOgSprzedazy - cenaOgKupna;

        System.out.println(cenaOgKupna);
        System.out.println(cenaOgSprzedazy);
        System.out.println(prowizjaZaplacona);
        System.out.println(zysk);
    }
}



