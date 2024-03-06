import java.util.Scanner;

public class bieg {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        String bieg1, bieg2, bieg3;
        double czas1, czas2, czas3;
        bieg1 = klaw.next();
        czas1 = klaw.nextDouble();

        bieg2 = klaw.next();
        czas2 = klaw.nextDouble();

        bieg3 = klaw.next();
        czas3 = klaw.nextDouble();

        if(czas1 < czas2 && czas1 < czas3){
            System.out.println(bieg1);
            System.out.println(czas1);
            System.out.println();

            System.out.println(bieg2);
            System.out.println(czas2);
            System.out.println();

            System.out.println(bieg3);
            System.out.println(czas3);
            System.out.println();
        }
    }
}
