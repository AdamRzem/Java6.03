import java.util.Scanner;

public class imieIZnaki {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;

        firstName = klawiatura.next();
        middleName = klawiatura.next();
        lastName = klawiatura.next();

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println(firstName + " " + middleName + " " + lastName);
        System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);
    }
}
