package variables;

import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //wprowadzam liczbę
        System.out.println("Wprowadź liczbę zmiennoprzecinkową: ");
        double number = scanner.nextDouble();
        //aby skonsumować ENTER wykonujemy metodę nextLine()
        //wprowadzam napis
        System.out.println("Wprowadź napis: ");
        String text = scanner.nextLine();
        System.out.printf("Wprowadziłeś: %f i %s", number, text);

        //zamknięcie połączenia
        scanner.close();
        

    }
}
