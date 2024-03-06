import java.util.Scanner;

public class wynikiIOceny {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wyniki trzech testów: ");
        double test1 = klawiatura.nextDouble();
        double test2 = klawiatura.nextDouble();
        double test3 = klawiatura.nextDouble();
        double srednia = (test1 + test2 + test3)/3;
        System.out.println(srednia);

        if (srednia >= 90 && srednia < 100 ){
            System.out.println(5);
        } else if (srednia >= 80 && srednia < 90) {
            System.out.println(4);
        } else if (srednia >= 70 && srednia < 80) {
            System.out.println(3);
        } else if (srednia >= 60 && srednia < 70) {
            System.out.println(2);
        }else {
            System.out.println(1);
        }
    }
}
