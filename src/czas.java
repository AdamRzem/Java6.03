import java.util.Scanner;

public class czas {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź liczbę sekund: ");
        int sec = klawiatura.nextInt();
        if (sec > 60 && sec > 3600 && sec > 86400){
            int dni = sec / 86400;
            int godziny = (sec % 86400)/3600;
            int minuty = (sec % 86400) - godziny * 3600;
            int sekundy = (sec % 86400) - godziny * 3600 - minuty * 60;


            System.out.println(dni);
            System.out.println(godziny);
            System.out.println(minuty);
            System.out.println(sekundy);
        }
    }
}
