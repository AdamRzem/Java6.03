import java.util.Scanner;

public class masa {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj masę obiektu: ");
        double masa = klawiatura.nextDouble();
        double ciezar = masa * 9.8;
        if (ciezar > 1000){
            System.out.println("Zbyt ciężkie.");
        } else if (ciezar < 10) {
            System.out.println("Zbyt lekkie.");
        }
    }
}
