package Loop;

public class OmittingInstructios {
    public static void main(String[] args) {
        //program wyszukujący określony znak w napisie
        // -> jeśli znaleziono -> wypisz pozycję tegi znaku
        // -> jeśli nie znaleziono wypisz stosowny komunikat
        String sentence = "Ale ma kota a kot ma Alę";
        char search = '.';
        boolean isFound = false;
        for (int i = 0; i < sentence.length() ; i++) {
            System.out.println("Iteracja nr.: " +i);
            if (sentence.charAt(i) != search){
                // pominiecie aktualnie wykonywanej iteracji i przejście do kolejnej
                continue;
            } else if (sentence.charAt(i) == search) {
                System.out.printf("Znaleziono znak %c na indeksie %d\n", sentence.charAt(i),i);
                isFound = true;
                break;
            }

        }
        if(isFound == false) {
            System.out.printf("Nie znaleziono %c w tekście %s", search, sentence);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }

    }

}
