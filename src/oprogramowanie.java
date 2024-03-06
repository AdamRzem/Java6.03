import java.util.Scanner;

public class oprogramowanie {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Liczba zakupionych pakietów: ");
        int liczba = klaw.nextInt();
        double cena = 99;
        double rabat = 0;
        double cenaPoRabacie = cena;
        if (liczba >= 10 && liczba < 20){
            rabat = 0.2;
            cenaPoRabacie = (cena - cena*rabat) * liczba;
        } else if (liczba >= 20 && liczba < 50) {
            rabat = 0.3;
            cenaPoRabacie = (cena - cena*rabat) * liczba;
        }else if (liczba >= 50 && liczba < 100) {
            rabat = 0.4;
            cenaPoRabacie = (cena - cena*rabat) * liczba;
        }else if (liczba >= 100 ) {
            rabat = 0.5;
            cenaPoRabacie = (cena - cena*rabat) * liczba;
        }
        System.out.println(rabat);
        System.out.println(cenaPoRabacie);
    }
}
