//2 Skriv ett program som frågar efter användarens namn och skriver ut en hälsning på konsolen.
// Om namnet är "Kalle" ska det skriva ut "Hej Kalle!"
import java.util.Scanner;

public class Uppgift2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad heter du");
        String name = scanner.next();

        System.out.println("Hej " + name);

    }
}
