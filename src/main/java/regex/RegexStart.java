package regex;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexStart {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Podaj numer PESEL");
            String PESEL = new Scanner(System.in).nextLine();
            //wzorzec zawierający wyrażenia regularne
            String pattern = "^[0-9]{11}$";
            if (Pattern.matches(pattern, PESEL)) {
                System.out.println("OK");
                break;
            } else {
                System.out.println("N-OK");
            }
        }
    }
}
