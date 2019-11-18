package Loop;

public class Loop {
    public static void main(String[] args) {
        String senstence = "Ale ma kota";
     // Ala ma kota
     // 012345678910
     // wypisz w pętli wszytskie znaki pojedyńcze
        for (int i = 0; i <= senstence.length() -1; i++) {
            if (senstence.charAt(i) != ' ') {
                System.out.printf("indeks: %d znak: %c\n", i, senstence.charAt(i));
            }

        }
        // tablica - zmienna przechowująca zestaw wartości uporządkowanych po indeksach
        // index 0 -> 2
        // index 1 -> 4
        // index 2 -> 6

        int numbers [] = {2,4,6,8};
        // for (typ pojedyńczej wartości nazwa_podręczna :kolekcja wartości)
        int index = 0;
        for (int number : numbers) {
            System.out.printf("indeks: %d wartość %d\n", index, number);
            index++;
        }
    }
}
