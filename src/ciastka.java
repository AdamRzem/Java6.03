import java.sql.SQLOutput;
import java.util.Scanner;

public class ciastka {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int lCiastek, lPorcji, spozyteCiastka;
        double kalorieNaCiastko, spozyteKalorie;
        lCiastek = 40;
        lPorcji = 10;
        kalorieNaCiastko = ((lCiastek/lPorcji)*300) / 40;

        spozyteCiastka = klawiatura.nextInt();
        spozyteKalorie = spozyteCiastka * kalorieNaCiastko;
        System.out.println("Spożyłeś: " + spozyteKalorie + " kalorii.");
    }
}
