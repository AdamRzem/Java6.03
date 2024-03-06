import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj dzień, miesiąc i dwie ostatnie cyfry roku: ");
        int dzien = klawiatura.nextInt();
        int miesiac = klawiatura.nextInt();
        int rok = klawiatura.nextInt();
        if(dzien * miesiac == rok){
            System.out.println("Data jest magiczna.");
        }else{
            System.out.println("Data nie jest magiczna.");
        }
    }
}
