import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double wynik1, wynik2, wynik3, srednia;
        wynik1 = klawiatura.nextDouble();
        wynik2 = klawiatura.nextDouble();
        wynik3 = klawiatura.nextDouble();
        srednia = (wynik1 + wynik2 + wynik3) / 3;
        System.out.println("Wynik 1 testu: " + wynik1);
        System.out.println("Wynik 2 testu: " + wynik2);
        System.out.println("Wynik 2 testu: " + wynik3);
        System.out.println("Średnia: " + srednia);
    }
}



