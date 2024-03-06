import java.util.Scanner;

public class droga {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wpisz przejechane kilometry: ");
        double kilometry;
        kilometry = klawiatura.nextDouble();

        System.out.println("Wpisz zużyte paliwo w l: ");
        double paliwo;
        paliwo = klawiatura.nextDouble();

        double kilometryNaLitrze;
        kilometryNaLitrze = kilometry/paliwo;
        System.out.println(kilometryNaLitrze);
    }
}
