import java.sql.SQLOutput;
import java.util.Scanner;

public class mieszkanie2 {

    public static void main(String[] args) {

        int  pom1szer, pom2szer, pom3szer, pom4szer, pom1dl, pom2dl, pom3dl, pom4dl, pom1pow, pom2pow, pom3pow, pom4pow, powMieszkania;

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj długość i szerokość pokoju 1 w metrach:");
        pom1dl = klawiatura.nextInt();
        pom1szer = klawiatura.nextInt();

        System.out.println("Podaj długość i szerokość pokoju 2 w metrach:");
        pom2dl = klawiatura.nextInt();
        pom2szer = klawiatura.nextInt();

        System.out.println("Podaj długość i szerokość pokoju 3 w metrach:");
        pom3dl = klawiatura.nextInt();
        pom3szer = klawiatura.nextInt();

        System.out.println("Podaj długość i szerokość pokoju 4 w metrach:");
        pom4dl = klawiatura.nextInt();
        pom4szer = klawiatura.nextInt();

        pom1pow = pom1szer * pom1dl;
        pom2pow = pom2szer * pom2dl;
        pom3pow = pom3szer * pom3dl;
        pom4pow = pom4szer * pom4dl;

        powMieszkania = pom1pow + pom2pow + pom3pow + pom4pow;



        System.out.println(powMieszkania);


        double powNaOsobe;
        powNaOsobe = powMieszkania/4;
        System.out.println(powNaOsobe);
    }
}