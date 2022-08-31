//6 Skriv ett program som frågar användaren efter två tal och skriver ut deras medelvärde.
//Exempel: om talen är 3 och 5 ska programmet skriva ut 4.

import java.util.Scanner;

public class Uppgift6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv två tal:");

        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();

        double middle = (double)(numOne + numTwo)/2;
        System.out.println(middle);


    }
}
