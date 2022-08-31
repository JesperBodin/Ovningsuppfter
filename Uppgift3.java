//3 Ändra programmet så att det även frågar efter ett tal.
// Spara det i en variabel. Skriv sedan ut det på konsolen.
// Tips: använd Integer.parseInt()
import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad heter du");
        String name = scanner.next();

        System.out.println("Hej " + name + ", hur gammal är du? ");

        String age = scanner.next();
        int age1 = Integer.parseInt(age);
        System.out.println("Okej, du är " + age1 + " år gammal.");

    }
}