import java.sql.SQLOutput;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner klawiwatura = new Scanner(System.in);
        double kwotaPocz, RRSO, wynik;
        int lata, ilKap;
        kwotaPocz = klawiwatura.nextDouble();
        RRSO = klawiwatura.nextDouble();
        lata = klawiwatura.nextInt();
        ilKap = klawiwatura.nextInt();
        wynik = kwotaPocz * Math.pow((1 + (RRSO/ilKap)), ilKap*lata);
        System.out.println(wynik);
    }
}


