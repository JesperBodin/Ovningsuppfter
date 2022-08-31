import java.util.Scanner;

//5 Skriv ett program som frågar användaren efter ett decimaltal.
// Programmet ska läsa in det, spara i en variabel, omvandla det till ett heltal och skriva ut.
// (Ska man använda , eller . i konsolen?)
// Tips: använd Double.parseDouble()
public class Uppgift5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv ett decimaltal:");

        String myDecimal = sc.next();
        double myDecimalTwo = Double.parseDouble(myDecimal);
        int intValue = (int)Math.round(myDecimalTwo);
        System.out.println(intValue);

    }
}
