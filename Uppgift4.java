//4 Skriv ett program som frågar användaren efter två tal.
// Programmet ska skriva ut talens summa (1+1) och produkt (1*1).
import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv ett tal:");
        int numberOne = sc.nextInt();
        System.out.println("Skriv ett till tal:");
        int numberTwo = sc.nextInt();
        int sum = (numberOne + numberTwo);
        int sum2 = (numberOne * numberTwo);
        System.out.println(numberOne + " + " + numberTwo + " = " + sum);
        System.out.println(numberOne + " * " + numberTwo + " = " + sum2);


    }
}
