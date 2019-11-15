package variables;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        // post inkrementacja
        System.out.println(i++);
        // po wpisaniu zmienna jest ikrementowana
        System.out.println(i);

        // pre dekrementacja
        System.out.println(--j);
        // po wpisaniu
        System.out.println(j);
        //jaki wynik? -> i=6 j=3
        System.out.println(((j++) * (--i + j--) + (++i)));
        // 3 * (5 + 4) + (6) = 33


        // sprawdź czy użytkownik jest pełnoletni
        // -> jeżeli jego wiek jest >= 18 lat wypisz "jesteś pełnoletni"
        // -> w przeciwnym razie wypisz "nie jesteś pełnoletni"
        // -> jeżeli wiek zawiera się w przedziale 0 do 120 to jesteś dorosły
        // -> jeżeli dane są inne to jesteś robotem
        int age;
        // utworzenie obiektu Scanner pozwalającego na wprowadzenie wartości do konsoli -> System.in
        Scanner scanner = new Scanner(System.in);
        // użytkownik wprowadza wartość do zmiennej age typu int metodą nextInt()
        System.out.println("Wprowadź swój wiek: ");
        age = scanner.nextInt();
        boolean isHuman = age >= 0 && age <= 120 ? true : false;
        String isMature = age >= 18 ? "jesteś dorosły" : "nie jesteś dorosły";
        System.out.println("Twój wiek to: " + age + " - " + isMature);
        System.out.println(isHuman ? isMature : "ROBOT");

        



    }
}
