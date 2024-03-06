import java.sql.SQLOutput;
import java.util.Scanner;

public class plytki {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cena, zysk;
        cena = klawiatura.nextDouble();
        zysk = cena * 0.4;
        System.out.println("Zysk: " + zysk);
    }
}

