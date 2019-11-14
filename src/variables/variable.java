package variables;

public class variable {
    public static void main(String[] args) {
        // deklaracja -> rezerwacja miejsca w pamięci podręcznej
        // typ nazwaZmiennej
        int age;
        // inicjalizacja -> pierwsze przypisanie warości
        age = 14;
        System.out.println("Wiek: " + age);
        // dekralacja i inicjalizacja (jednocześnie)
        double result = 0.01;
        System.out.println("wynik: " + result);
        // modyfikacja wartości zmiennej
        age = age + 5;
        System.out.println("Wiek: " + age);
        age *=5;
        System.out.println("Wiek: " + age);

        // stałe

        final byte HOURS_IN_DAY = 24;
        final boolean DECISION;

        DECISION = true;




    }
}
