import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        double kalorieTluszcz, gramy, kalorieOg;

        gramy = klaw.nextDouble();
        kalorieOg = klaw.nextDouble();
        kalorieTluszcz = gramy * 9;
        if(kalorieTluszcz > kalorieOg){
            System.out.println("Błąd");
        }
        double procent = kalorieTluszcz/kalorieOg;
        System.out.println(procent);
        if(procent<0.3){
            System.out.println("Produkt niskotłuszczowy");
        }
    }
}
