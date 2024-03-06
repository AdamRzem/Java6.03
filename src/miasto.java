import java.sql.SQLOutput;
import java.util.Scanner;

public class miasto {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String miasto;
        miasto = klawiatura.next();
        int liczbaZnakow = miasto.length();
        String capital = miasto.toUpperCase();
        String lower = miasto.toLowerCase();
        char Pierwszy = miasto.charAt(0);
        System.out.println(miasto);
        System.out.println(liczbaZnakow);
        System.out.println(capital);
        System.out.println(lower);
        System.out.println(Pierwszy);
    }
}