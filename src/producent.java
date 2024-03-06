import java.sql.SQLOutput;
import java.util.Scanner;

public class producent {
    public static void main(String[] args) {
        Scanner klawiwatura = new Scanner(System.in);

        int lUczestnikow = 12467;
        double kupuja = 0.14;
        double cytrusowe = 0.64;
        int osobyKupujace = Math.toIntExact(Math.round(lUczestnikow*kupuja));
        int preferujaCytrusowy = Math.toIntExact(Math.round(lUczestnikow*cytrusowe));
        System.out.println(osobyKupujace);
        System.out.println(preferujaCytrusowy);
    }
}


