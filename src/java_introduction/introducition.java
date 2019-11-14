package java_introduction;

import java.io.PrintStream;
import java.sql.SQLOutput;

public class introducition {
    // metoda uruchomieniowa -> automatycznie wywoływana jako pierwsza w trakcie uruchomiania projektu
    public static void main(String[] args) {
//        polecenie wypisujące wartości pdane w argumencie na standartowym wyjściu
        System.out.println("Hello World!");
//        pobranie numeru wersji jre
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

        // typy danych
        int number = 50;
        System.out.println("number = " + number);
        // byte mySmallNumber = 55555555; -> błąd zbyt mała precyzja typu byte
        System.out.println("Dodawanie liczb: " + (100 + number));
        double salaryNet = 9150.99;
        int vatTax = 23;
        System.out.println("Kwota netto: " + salaryNet + "zł");

        System.out.println("Kwota brutto: " + (salaryNet * (1 + (vatTax/100.0))) + "zł");
        System.out.printf("Kwota brutto: %.2f zł\n", salaryNet * (1 + (vatTax/100.0)));
        System.out.printf("%.2fzł netto to %.2fzł brutto\n", salaryNet, salaryNet * (1 + (vatTax/100.0)));


        char smallLetter = 'a';
        char bigLetter = 'A';
        char spaceChar = ' ';
        char dotChar = '.';


        System.out.println(smallLetter);
        System.out.println((char) (bigLetter +10));
        System.out.printf("Wpisz ten znak z formatowaniem: %c\n", dotChar);
        System.out.printf("Znak: %c ma %d numer ASCII\n", dotChar, (int)dotChar);


        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);
    }
}
