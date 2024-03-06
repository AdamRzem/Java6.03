import java.util.Scanner;

public class napiwek {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź cenę: ");
        double cena, cenaPoPodatkach;
        cena = klawiatura.nextDouble();
        double podatekStanowy = 0.04 * cena;
        double podatekLokalny = 0.02 * cena;

        cenaPoPodatkach = cena + podatekStanowy + podatekLokalny;
        System.out.println(cenaPoPodatkach);
    }
}
