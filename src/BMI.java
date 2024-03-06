import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double waga = klawiatura.nextDouble();
        double wzrost = klawiatura.nextDouble();
        double bmi = waga / Math.pow(wzrost, 2);
        System.out.println(bmi);
        if(bmi > 18.5 && bmi < 25){
            System.out.println("Dobry tryb życia");
        } else if (bmi <= 18.5) {
            System.out.println("Niedowaga");
        }else{
            System.out.println("Nadwaga");
        }
    }
}
