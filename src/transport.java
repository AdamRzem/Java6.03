import java.util.Scanner;

public class transport {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        double waga = klaw.nextDouble();
        int odl = klaw.nextInt();
        int mnoznik = odl / 500 ;

        if(odl % 500 != 0){
            mnoznik += 1;
        }

        double koszt;

        if(waga <= 1){
            koszt = mnoznik * 1.1;
        } else if (waga > 1 && waga <= 3) {
            koszt = mnoznik * 2.2;
        } else if (waga > 3 && waga <= 5) {
            koszt = mnoznik * 3.7;
        } else if (waga > 5) {
            koszt = mnoznik * 3.8;
        }else{
            koszt = 0;
        }
        System.out.println(koszt);
    }
}
